package io.devstream.smartapp_team_five;

//31-03-2015
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

import org.json.JSONArray;
import org.json.JSONObject;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;


public class CalendarActivity extends Activity {

	ListView lvDetail;
    Context context = CalendarActivity.this;
    //ArrayList<ListData> myList = new ArrayList<ListData>();	

	JSONObject objAppointment,objServiceUser,serviceUserList;
	JSONArray appointmentList;
	ProgressDialog mProgressDialog;
	//ArrayList<String> appointmentList;
	ArrayList<Appointment> appsList;
	
	final String ipAddr="http://54.72.7.91:8888/";
	
	String loginURL= ipAddr + "login";
	String AppointmenstURL = ipAddr + "appointments";
	String tableURL = ipAddr + "appointments?date=2015-03-31&clinic_id=2";

	String TAG =  "calact";
	ProgressBar progressBar;

    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		/*
		extras = getIntent().getExtras();
		clinicName = DataManager.getClinicDates().getClinicName();
		appointmentDate = DataManager.getClinicDates().getAppointmentDate();
		weekDay = DataManager.getClinicDates().getWeekDay();	
		 */		
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calendar);	
		// Download JSON file AsyncTask
		Button btnPrev = (Button) findViewById(R.id.btnPrev);
		Button btnNext = (Button) findViewById(R.id.btnNext);
		TextView tvDate = (TextView) findViewById(R.id.tvDate);
		TextView tvProgress = (TextView) findViewById(R.id.tvProgress);
		
		String todayAsString = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
		tvDate.setText(todayAsString);
	
		
		btnPrev.setOnClickListener(new ButtonListener());
		btnNext.setOnClickListener(new ButtonListener());
		
		new DownloadJSON().execute();
	}
		

	private class ButtonListener implements View.OnClickListener {
		@Override
		public void onClick(View v) {
			Intent intent;
			switch (v.getId()) {           
				case R.id.btnPrev:
					/** Start a new Activity */
			        intent = new Intent(CalendarActivity.this, CalendarActivity.class);
			        startActivity(intent);

					break;				
				case R.id.btnNext:
					/** Start a new Activity */
			        intent = new Intent(CalendarActivity.this, CalendarActivity.class);
			        startActivity(intent);
					break;
			}
		}
	}
	// Download JSON file AsyncTask
	/*The three types used by an asynchronous task are the following:
    Params, the type of the parameters sent to the task upon execution.
    Progress, the type of the progress units published during the background computation.
    Result, the type of the result of the background computation.
    
    AsyncTask is a generic class, it uses 3 types: AsyncTask<Params, Progress, Result>.
    Params – the input. what you pass to the AsyncTask
    Progress – if you have any updates, passed to onProgressUpdate()
    Result – the output. what returns doInBackground()


	 */
	//---------------------------------------------------------------------------------------
	private class DownloadJSON extends AsyncTask<Void, Integer, Void> {
		@Override
		protected void onPreExecute() {
					
			progressBar = (ProgressBar) findViewById(R.id.pbLoading);
			progressBar.setVisibility(ProgressBar.VISIBLE);
			
			//super.onPreExecute();
			//************mProgressDialog.show();
		}
		@Override
		protected void onProgressUpdate(Integer... values) {
			// TODO Auto-generated method stub
			//System.out.println("jp02  values=" + values[0]);
			//Log.d(TAG, "progupdate values=" + values[0] +">");		
		    //progress.incrementProgressBy(index);
			//progressBar.setProgress(values[0]);
			//super.onProgressUpdate(values[0]);
			
			// Getting reference to the TextView 
			TextView tvProgress = (TextView) findViewById(R.id.tvProgress);	

			
			// Updating the TextView 
			tvProgress.setText( Integer.toString(values[0].intValue()));	
			
		}
		
		@Override
		protected Void doInBackground(Void... params) {
		   
			//ProgressBar.setVisibility(View.VISIBLE);
			//Create an array to populate the list			
			appsList = new ArrayList<Appointment>();
			HttpAuthClass  httpAcc = new HttpAuthClass(loginURL,tableURL);
			


			objAppointment = httpAcc.getJsonobj();

			try {
				// Locate the NodeList name
				appointmentList = objAppointment.getJSONArray("appointments");
				int max = appointmentList.length();
				
				//progressBar.setMax(max);
				
				for (int i = 0; i < max; i++) {
					//String s = ""+(i/(float)max)*100;
					progressBar.setProgress(i);  	
					publishProgress(i);
					
					objAppointment = appointmentList.getJSONObject(i);
					Appointment appointment = new Appointment();													
					try {

						JSONObject infoObject = objAppointment.getJSONObject("service_user");						
						Log.d(TAG, "infoObject>>" + infoObject.toString());						
						String name = infoObject.optString("name").toString();	
						appointment.setService_user_name(name);
						String gestation = infoObject.optString("gestation").toString();
						if (gestation == null) gestation ="NULLY";
						appointment.setGestation(gestation);
						Log.d(TAG, "gestation>>" + gestation + "<<");
					} catch (Exception e) {
						Log.e("Error", e.getMessage());
						//e.printStackTrace();
					}		
					String date = objAppointment.optString("date");
					appointment.setDate(date);
					String time = objAppointment.optString("time");
					appointment.setTime(objAppointment.optString("time"));
					

					
					Date inDate = new Date();
					String strDate = date+" "+time;
					SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
					inDate  = format1.parse(strDate);
					System.out.println(inDate);
					
					appointment.setDateTime(inDate);
					if (i==0) {
						SimpleDateFormat  formatter = new SimpleDateFormat("EEE, dd/MM/yyyy");
						String appDate = formatter.format(date);
						System.out.println("App Date : " + appDate);
						//jpTextView tvDate = (TextView) view.findViewById(R.id.tvDate);
						//tvDate.setText(appDate);
					}					
					appointment.setClinic_id(objAppointment.optString("clinic_id"));
					Log.d(TAG, "inDate>>" + inDate + "<<" + strDate + ">> " + objAppointment.optString("clinic_id") );
					appointment.setService_provider_id(objAppointment.optString("service_provider_id"));
					appsList.add(appointment);
					Log.d(TAG,"jp1>"+i+appointment.getDate() );
					
					//--------------------------------------
					//service_user_id - get the name

					tableURL = ipAddr + "service_users/"+objAppointment.optString("service_user_id");
					HttpAuthClass  httpAcc1 = new HttpAuthClass(loginURL,tableURL);
					objServiceUser = httpAcc1.getJsonobj();
	
				
					Singleton serviceUser = new Singleton();
					serviceUser.setQueryObject(objServiceUser);
					Log.d(TAG, "Service User>>" + serviceUser.toString());	
				}
				
				
				//http://stackoverflow.com/questions/5927109/sort-objects-in-arraylist-by-date
				Collections.sort(appsList, new Comparator<Appointment>() {
					  public int compare(Appointment o1, Appointment o2) {
					      if (o1.getDateTime() == null || o2.getDateTime() == null)
						        return 0;
					      return o1.getDateTime().compareTo(o2.getDateTime());
					  }
					});

				
			} catch (Exception e) {
				Log.e("Error", e.getMessage());
				e.printStackTrace();
			}
			return null;
		}
		//---------------------------------------------------------------------------------------


		@Override
		protected void onPostExecute(Void args) {	
			//listView listview = ?ListView?findViewById(R.id.listView1);
			
			lvDetail = (ListView) findViewById(R.id.lvlist);
			progressBar.setVisibility(View.GONE);
        	// insert data into the list before setting the adapter
        	// otherwise it will generate NullPointerException  - Obviously
        	lvDetail.setAdapter(new MyBaseAdapter(context, appsList));
		}
		
		
	}
	
}