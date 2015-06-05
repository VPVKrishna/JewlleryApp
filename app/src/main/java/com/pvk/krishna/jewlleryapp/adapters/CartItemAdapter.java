package com.pvk.krishna.jewlleryapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.pvk.krishna.jewlleryapp.R;
import com.pvk.krishna.jewlleryapp.core.CardItem;

import java.util.List;

public class CartItemAdapter extends BaseAdapter {

	private List<CardItem> listitem;
	private LayoutInflater inflater;

	public CartItemAdapter(Context context, List<CardItem> listitem) {
		inflater = LayoutInflater.from(context);
		this.listitem = listitem;
	}

	@Override
	public int getCount() {
		return listitem.size();
	}

	@Override
	public CardItem getItem(int arg0) {
		return listitem.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		return 0;
	}

	@Override
	public View getView(int pos, View view, ViewGroup vg) {
		ViewHolder holder;
		if (view == null) {
			view = inflater.inflate(R.layout.cart_listitem, null);
			holder = new ViewHolder(view);
			view.setTag(holder);
		} else {
			holder = (ViewHolder) view.getTag();
		}
		holder.updateView(getItem(pos));
		return view;
	}

	private static class ViewHolder {

		public ViewHolder(View view) {
		}

		public void updateView(CardItem item) {

		}

	}

}
