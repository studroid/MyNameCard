package june.namecard.mynamecard;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomDialog extends Dialog{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		WindowManager.LayoutParams lpWindow = new WindowManager.LayoutParams();    
		lpWindow.flags = WindowManager.LayoutParams.FLAG_DIM_BEHIND;
		lpWindow.dimAmount = 0.8f;
		getWindow().setAttributes(lpWindow);
		
		setContentView(R.layout.custom_dialog);
		
		setLayout();
		setClickListener(mClickListener);
	}
	
	public CustomDialog(Context context) {
		// Dialog 諛곌꼍���щ챸 泥섎━ �댁���
		super(context , android.R.style.Theme_Translucent_NoTitleBar);
	}
	
	public CustomDialog(Context context ,
			View.OnClickListener tutorial_click) {
		super(context , android.R.style.Theme_Translucent_NoTitleBar);
		this.mClickListener = tutorial_click;
	}
	
	
	private void setClickListener(View.OnClickListener tutorial_click){
		((ImageView)findViewById(R.id.tutorial_pic)).setOnClickListener(tutorial_click);
	}
	
	/*
	 * Layout
	 */
	private TextView mTitleView;
	private TextView mContentView;
	private Button mLeftButton;
	private Button mRightButton;
	private String mTitle;
	private String mContent;
	
	
	private View.OnClickListener mClickListener;
	
	/*
	 * Layout
	 */
	private void setLayout(){
		mLeftButton = (Button) findViewById(R.id.bt_left);
		mRightButton = (Button) findViewById(R.id.bt_right);
	}
	
}









