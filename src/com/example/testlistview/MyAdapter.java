package com.example.testlistview;

import android.widget.BaseAdapter;
import android.view.LayoutInflater;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;

import java.util.List;
import java.util.Map;


public class MyAdapter extends BaseAdapter {
	private final class ViewHolder{
		public ImageView img;
		public TextView title;
		public TextView info;
		public Button viewBtn;
	}
	
	private LayoutInflater mInflater = null;
	private List<Map<String, Object>> mData = null;
	private int mSelectedPosition = -1;
	
	public MyAdapter(Context context, List<Map<String, Object>> data) {
		this.mInflater = LayoutInflater.from(context);
		this.mData = data;
	}
	    
    public void setSelectedPosition(int position) {  
    	mSelectedPosition = position;  
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
		ViewHolder holder = null;
		if (convertView == null) {
			holder=new ViewHolder(); 
			convertView = mInflater.inflate(R.layout.vlist2, null);
			holder.img = (ImageView)convertView.findViewById(R.id.img);
			holder.title = (TextView)convertView.findViewById(R.id.title);
			holder.info = (TextView)convertView.findViewById(R.id.info);
			holder.viewBtn = (Button)convertView.findViewById(R.id.view_btn);
			convertView.setTag(holder);
		}else {
			holder = (ViewHolder)convertView.getTag();
		}

		holder.img.setBackgroundResource((Integer)mData.get(position).get("img"));
		holder.title.setText((String)mData.get(position).get("title"));
		holder.info.setText((String)mData.get(position).get("info"));

		holder.viewBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//showInfo();                
			}
		});
		
		if(mSelectedPosition == position) {
			int iii = 0;
			iii = 10;
		}
		return convertView;
	}
}
