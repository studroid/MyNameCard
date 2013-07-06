package june.namecard.mynamecard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;



// 새 명함 제작 or 기존 레이아웃에 데이터 입력.
// 여긴 끝.
public class select_template extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		setContentView(R.layout.select_template);
		
		setResult(1);
		
		
		
		ImageView select_btn = (ImageView)findViewById(R.id.template);
		ImageView select_btn2 = (ImageView)findViewById(R.id.template2);
		
		
		select_btn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				findViewById(R.id.template).setVisibility(View.GONE);
				findViewById(R.id.template2).setVisibility(View.VISIBLE);
			}
		});
		
		
		select_btn2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent next_intent = new Intent(getApplication(),LayoutSelect.class);
				startActivityForResult(next_intent, 1);
			}
		});
		super.onCreate(savedInstanceState);
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub

		findViewById(R.id.template).setVisibility(View.VISIBLE);
		findViewById(R.id.template2).setVisibility(View.GONE);
		super.onActivityResult(requestCode, resultCode, data);
	}
	
	
}
