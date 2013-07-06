package june.namecard.mynamecard;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;


// 결과 화면 나오는 layout
public class result_layout extends FragmentActivity{

	SectionsPagerAdapter mSectionsPagerAdapter;

	/**
	 * The {@link ViewPager} that will host the section contents.
	 */
	ViewPager mViewPager;
	
	
	static int view_flag=0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		setContentView(R.layout.result_layout2);

		mSectionsPagerAdapter = new SectionsPagerAdapter(
				getSupportFragmentManager());

		// Set up the ViewPager with the sections adapter.
		mViewPager = (ViewPager) findViewById(R.id.pager);
		mViewPager.setAdapter(mSectionsPagerAdapter);
		
		
		
		
		String[] Data;
		
		//Data = getIntent().getExtras().getStringArray("Data");
		
		super.onCreate(savedInstanceState);
	}
	

	
	/**
	 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
	 * one of the sections/tabs/pages.
	 */
	public class SectionsPagerAdapter extends FragmentPagerAdapter {

		public SectionsPagerAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int position) {
			// getItem is called to instantiate the fragment for the given page.
			// Return a DummySectionFragment (defined as a static inner class
			// below) with the page number as its lone argument.
			Fragment fragment = new DummySectionFragment();
			Bundle args = new Bundle();
			args.putInt(DummySectionFragment.ARG_SECTION_NUMBER, position + 1);
			fragment.setArguments(args);
			return fragment;
		}

		@Override
		public int getCount() {
			// Show 3 total pages.
			return 2;
		}

		@Override
		public CharSequence getPageTitle(int position) {
			switch (position) {
			case 0:
				return "";
//				return getString(R.string.title_section1).toUpperCase();
			case 1:
				return "";
//				return getString(R.string.title_section2).toUpperCase();
			}
			return null;
		}
	}
	

	public static class DummySectionFragment extends Fragment {
		/**
		 * The fragment argument representing the section number for this
		 * fragment.
		 */
		public static final String ARG_SECTION_NUMBER = "section_number";

		public DummySectionFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {

			
			
			if(view_flag == 1){
				
				LinearLayout linear = new LinearLayout(getActivity());
				linear.setOrientation(LinearLayout.VERTICAL);
				
				Button save_btn = new Button(getActivity());
				save_btn.setText("명함 저장");
				Button camera_btn = new Button(getActivity());
				camera_btn.setText("사진첩 저장");
				Button order_btn = new Button(getActivity());
				order_btn.setText("주문하기");
				
				linear.addView(save_btn);
				linear.addView(camera_btn);
				linear.addView(order_btn);
				
				view_flag = 2;
				return linear;
			}else{
				ImageView image = new ImageView(getActivity());
				image.setBackgroundResource(R.drawable.bcardex02);
				
				view_flag = 1;
				return image;
			}
			
			// Create a new TextView and set its text to the fragment's section
			/*// number argument value.
			TextView textView = new TextView(getActivity());
			Button layoutbtn = new Button(getActivity());
			
			LayoutParams param = new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT);
//			layoutbtn.setBackground();
			layoutbtn.setText("레이아웃 배치할 버튼.");
			layoutbtn.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					Intent next_intent = new Intent(getActivity(),Data_Input.class);
					next_intent.putExtra("layout_id", 1);
					startActivity(next_intent);
					// 다음 화면 부를 인텐트 제작.
				}
			});
			layoutbtn.setLayoutParams(param);
			
			textView.setGravity(Gravity.CENTER);
			textView.setText(Integer.toString(getArguments().getInt(
					ARG_SECTION_NUMBER)));
			return layoutbtn;*/
		}
	}
}
