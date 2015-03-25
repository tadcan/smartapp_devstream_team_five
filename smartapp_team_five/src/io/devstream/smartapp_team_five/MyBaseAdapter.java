package io.devstream.smartapp_team_five;

// pcsalt.example.customlistviewdemo;

import java.util.ArrayList;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.view.ViewParent;
import android.view.WindowManager.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MyBaseAdapter extends BaseAdapter  {

	ArrayList<Appointment> appsList = new ArrayList<Appointment>();
	LayoutInflater inflater;
	Context context;
	String TAG =  "mybase";


	
	public MyBaseAdapter(Context context, ArrayList<Appointment> appsList) {
		this.appsList = appsList;
		this.context = context;
		inflater = LayoutInflater.from(this.context); 
	}

	@Override
	public int getCount() {
		return appsList.size();
	}

	@Override
	public Appointment getItem(int position) {
		return appsList.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}


	@Override
	public View getView(final int position, View convertView, ViewGroup parent)  {
	    View view = null;
	    // Test to see if there is already a view, if not create one, else use what 
	    // already exists in convertView

		if (convertView == null) { 
			// if there is no existing view 
			// use an Inflater to build the row layout and store in view
			view = inflater.inflate(R.layout.activity_calendar_row_item,	parent, false);
		} else {
			Log.d(TAG, "convertView not null " + position );
			view = convertView;
		}
		// Locate the textviews
		//TextView tvClinic = (TextView) view.findViewById(R.id.tvClinic);

		Button btnSun = (Button) view.findViewById(R.id.btnSun);
		btnSun.setOnClickListener(new ButtonClickListener());

		Button btnInfo = (Button) view.findViewById(R.id.btnInfo);
		btnInfo.setOnClickListener(new ButtonClickListener());

		//TextView tvDate = (TextView) view.findViewById(R.id.tvDate);
		TextView tvTime = (TextView) view.findViewById(R.id.tvTime);
		TextView tvGest = (TextView) view.findViewById(R.id.tvGest);
		
		// Set the text followed by the position
		//tvClinic.setText(appsList.get(position).getClinic_id());
		btnSun.setText(appsList.get(position).getService_user_name());
		//tvDate.setText(appsList.get(position).getDate());
		tvTime.setText(appsList.get(position).getTime().substring(0,5));
		tvGest.setText(appsList.get(position).getGestation());
		
		//btnInfo.setTag(position, appsList.get(position));
		//btnSun.setTag(position, appsList.get(position));
		btnInfo.setTag(position);
		btnSun.setTag(position);
		Log.d(TAG, "convertView IS null " + position);
					
		/*
		int mRowHeight =16;
		 final LayoutParams params = (LayoutParams) view.getLayoutParams();
         if (params == null) { 
             view.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, mRowHeight)); 
         	}else { 
        	 params.height = mRowHeight; }
         */
	     return view;
	}
	private class itemClickListener implements OnItemClickListener  {

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int position,
				long arg3) {
			// TODO Auto-generated method stub
			//do your job here, position is the item position in ListView
		}
	}
	private class ButtonClickListener implements OnClickListener {
		@Override
		public void onClick(View v) {
			
			final int position = (Integer) v.getTag();
			
			switch (v.getId()) {

			case R.id.btnInfo:
		
				/** Start a new Activity */
				Log.d(TAG, "Button  Clicked" + position);
				// Toast.makeText(v.getContext(), "Button Click ",
				// Toast.LENGTH_LONG).show();
								
				String message =" Item <" + position + ">"  
				        +  getItem(position).toString() 
						+ " was clicked";
				
				LayoutInflater inflater2= (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);		
				ViewGroup parentVg = (ViewGroup) v.getParent();
				View layout = inflater2.inflate(R.layout.banner_alert, parentVg, false);
				//View layout = inflater2.inflate(R.layout.banner_alert, null);
		    	TextView tv = (TextView) layout.findViewById(R.id.text);
		    	tv.setText(message);
		    	//Toast toast = new Toast(getApplicationContext());
		    	Toast toast = new Toast(context);
		    	toast.setGravity(Gravity.TOP, 0, 0);
		    	toast.setView(layout);
		    	toast.show();
		    			    	
		    	
		    	
				new ToastAlert(context, message);
				//Toast.makeText(	context,message, Toast.LENGTH_LONG).show();
				break;
			case R.id.btnSun:
				// Start a new Activity
				Intent intent = new Intent(context.getApplicationContext(),ServiceUserActivity.class);
				//intent.putExtra("service_user_id", appsList.get(position).getService_user_id() );
				//sendIntent.putExtra(Intent.
				context.startActivity(intent);   
				break;
			}
		}

		private AdapterView<ListAdapter> getListView() {
			// TODO Auto-generated method stub
			return null;
		}
	}



}
