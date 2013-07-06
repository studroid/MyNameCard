package june.namecard.mynamecard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Data_Input extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		setContentView(R.layout.data_input);
		
		Button ok_btn = (Button)findViewById(R.id.ok);
		ok_btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String name;
				String mail;
				String phone;
				String address;
				String[] Data = new String[4];
				
				
				Data[0] = ((EditText)findViewById(R.id.editText1)).getText().toString();
				Data[1] = ((EditText)findViewById(R.id.editText2)).getText().toString();
				Data[2] = ((EditText)findViewById(R.id.editText3)).getText().toString();
				Data[3] = ((EditText)findViewById(R.id.editText4)).getText().toString();
				
				Intent next_intent = new Intent(getApplication(),result_layout.class);
				
				next_intent.putExtra("Data", Data);
				
				startActivity(next_intent);
			}
		});
		
		super.onCreate(savedInstanceState);
	}
	
	
}
