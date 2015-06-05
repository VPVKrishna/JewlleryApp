package com.pvk.krishna.jewlleryapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.pvk.krishna.jewlleryapp.adapters.CartItemAdapter;
import com.pvk.krishna.jewlleryapp.core.CardItem;

import java.util.ArrayList;

public class MainActivity extends Activity {

	private ListView lisView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.card_list);
		lisView = (ListView) findViewById(R.id.lv_carts);
		ArrayList<CardItem> arrayList = new ArrayList<CardItem>();
		for (int i = 0; i < 2; i++) {
			arrayList.add(new CardItem());
		}
		CartItemAdapter adapter = new CartItemAdapter(getApplicationContext(),
				arrayList);
		lisView.setAdapter(adapter);
	}
}
