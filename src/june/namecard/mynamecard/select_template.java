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
		select_btn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent next_intent = new Intent(getApplication(),LayoutSelect.class);
				startActivity(next_intent);
			}
		});
		super.onCreate(savedInstanceState);
	}
}
