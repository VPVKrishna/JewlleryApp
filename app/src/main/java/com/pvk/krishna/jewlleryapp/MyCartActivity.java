package com.pvk.krishna.jewlleryapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;

import com.pvk.krishna.jewlleryapp.pager.MyPagerAdapter;


public class MyCartActivity extends FragmentActivity {

	public final static int PAGES = 10;
	// You can choose a bigger number for LOOPS, but you know, nobody will fling
	// more than 1000 times just in order to test your "infinite" ViewPager :D 
	public final static int LOOPS = 10; 
	public final static int FIRST_PAGE = 9;
	public final static float BIG_SCALE = 1.0f;
	public final static float SMALL_SCALE = 0.8f;
	public final static float DIFF_SCALE = BIG_SCALE - SMALL_SCALE;
	
	public MyPagerAdapter adapter;
	public ViewPager pager;
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);
		
		initializePager();
		
		findViewById(R.id.btn_add_to_cart).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(MyCartActivity.this, MainActivity.class));
			}
		});
	}
	
	
	public void initializePager(){
		pager = (ViewPager) findViewById(R.id.myviewpager);

		adapter = new MyPagerAdapter(this, this.getSupportFragmentManager());
		pager.setAdapter(adapter);
		pager.setOnPageChangeListener(adapter);
		
		// Set current item to the middle page so we can fling to both
		// directions left and right
		pager.setCurrentItem(FIRST_PAGE);
		
		// Necessary or the pager will only have one extra page to show
		// make this at least however many pages you can see
		pager.setOffscreenPageLimit(5);
		
		
		// Set margin for pages as a negative number, so a part of next and 
		// previous pages will be showed
		pager.setPageMargin(Integer.parseInt(getString(R.string.pagermargin)));
	}
}
