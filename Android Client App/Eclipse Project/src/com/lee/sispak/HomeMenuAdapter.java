package com.lee.sispak;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeMenuAdapter extends ArrayAdapter<String> {
	private final Context context;
	private final String[] values;
	private final int layoutID;
	
	public HomeMenuAdapter(Context context, int layoutID, String[] values)
	{
		super(context, layoutID, values);
		this.layoutID = layoutID;
		this.context = context;
		this.values = values;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context
			.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
 
		View rowView = inflater.inflate(this.layoutID, parent, false);
		TextView textView = (TextView) rowView.findViewById(R.id.textView1);
		ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView1);
		textView.setText(values[position]);
 
		// Change icon based on name
		String s = values[position];
 
		return rowView;
	}
}
