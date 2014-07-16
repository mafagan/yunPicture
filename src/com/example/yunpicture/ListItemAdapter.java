package com.example.yunpicture;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListItemAdapter extends BaseAdapter {
	private LayoutInflater listViewInflater;
	private List<Map<String,  Object>> mData;
	
	public ListItemAdapter(Context context){
		listViewInflater = LayoutInflater.from(context);
		
	}
	
	private void init(){
		mData = new ArrayList<Map<String,Object>>();
		
		for (int i = 0; i < 5; i++) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("img", R.drawable.icon);
			map.put("title", "test");
			mData.add(map);
		}
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mData.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ViewHolder holder = null;
		
		if (convertView == null) {
			holder = new ViewHolder();
			convertView = listViewInflater.inflate(R.layout.list_view_item, null);
			holder.img = (ImageView) convertView.findViewById(R.id.view_img);
			holder.titleTextView = (TextView) convertView.findViewById(R.id.view_text);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		
		holder.img.setBackgroundResource((Integer) mData.get(position).get("img"));
		holder.titleTextView.setText(mData.get(position).get("title").toString());
		return convertView;
	}
	
	public final class ViewHolder{
		public ImageView img;
		public TextView titleTextView;
	}
}
