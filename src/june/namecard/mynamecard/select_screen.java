package june.namecard.mynamecard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;


// 가로 세로 선택 화면 시작 레이아웃.
// dialog 처리만 하면 끝.
public class select_screen extends Activity{
	CustomDialog tutorial;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.select_screen);
		tutorial = new CustomDialog(select_screen.this, leftClickListener);
		
		final ImageView select_btn = (ImageView)findViewById(R.id.screen);
		final ImageView select_btn2 = (ImageView)findViewById(R.id.screen2);
		
		
		select_btn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				select_btn2.setVisibility(View.VISIBLE);
				select_btn.setVisibility(View.GONE);
			}
		});

		select_btn2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent next_intent = new Intent(getApplication(),select_template.class);
				startActivityForResult(next_intent, 1);
			}
		});
		super.onCreate(savedInstanceState);
		tutorial.show();
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		findViewById(R.id.screen).setVisibility(View.VISIBLE);
		findViewById(R.id.screen2).setVisibility(View.GONE);
		super.onActivityResult(requestCode, resultCode, data);
	}
	

	private View.OnClickListener leftClickListener = new View.OnClickListener() {
		@Override
		public void onClick(View v) {
			tutorial.dismiss();
		}
	};
	
	
}
