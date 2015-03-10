package io.devstream.smartapp_team_five;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ServiceOptionsActivity extends Activity {

	private Button clinicDominoDublin;
	private Button clinicDominoWicklow;
	private Button clinicEthDublin;
	private Button clinicEthWicklow;
	private Button clinicSatellite;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_service_options);
		
		// set buttons for page
		clinicDominoDublin = (Button)findViewById(R.id.clinics_domino_dublin);
		Log.d("ButtonLog", clinicDominoDublin.toString());
		clinicDominoDublin.setOnClickListener(new ButtonClick() );
		Log.d("ButtonLog", "after dd button click");
		
		clinicDominoWicklow = (Button)findViewById(R.id.clinics_domino_wicklow);
		Log.d("ButtonLog", clinicDominoWicklow.toString());
		clinicDominoWicklow.setOnClickListener(new ButtonClick() );
		Log.d("ButtonLog", "after dw button click");
		
		clinicEthDublin = (Button)findViewById(R.id.clinics_eth_dublin);
		clinicEthDublin.setOnClickListener(new ButtonClick() );
		
		clinicEthWicklow = (Button)findViewById(R.id.clinics_eth_wicklow);
		clinicEthWicklow.setOnClickListener(new ButtonClick() );
		
		clinicSatellite = (Button)findViewById(R.id.clinics_satellite);
		clinicSatellite.setOnClickListener(new ButtonClick() );
		
	}
	
	private class ButtonClick implements View.OnClickListener {
		
		public void onClick(View v) {
			
			
			switch( v.getId() ) {
				case R.id.clinics_domino_dublin:
						Log.d("ButtonLog","Inside case domino dublin");
					// launch intent to service option page
					Intent toDominoDublinView = new Intent(ServiceOptionsActivity.this, ClinicsDominoDublinActivity.class);
						Log.d("ButtonLog","dd set intent with this and class");
					ServiceOptionsActivity.this.startActivity(toDominoDublinView);
						Log.d("ButtonLog", "dd from current activity launch new activity");
				break;
				
				case R.id.clinics_domino_wicklow:
					Log.d("ButtonLog","Inside case domino dublin");
					// launch intent to service option page
					Intent toDominoDublinView1 = new Intent(ServiceOptionsActivity.this, ClinicsDominoWicklowActivity.class);
						Log.d("ButtonLog","dd set intent with this and class");
					ServiceOptionsActivity.this.startActivity(toDominoDublinView1);
						Log.d("ButtonLog", "dd from current activity launch new activity");
				break;
				
				case R.id.clinics_eth_dublin:
					Log.d("ButtonLog","Inside case eth dublin");
					Intent toETHDublinView = new Intent(ServiceOptionsActivity.this, ClinicsETHDublinActivity.class);
					ServiceOptionsActivity.this.startActivity(toETHDublinView);
				break;
				
				case R.id.clinics_eth_wicklow:
					Log.d("ButtonLog","Inside case eth wicklow");
					Intent toETHWicklowView = new Intent(ServiceOptionsActivity.this, ClinicsETHWicklowActivity.class);
					ServiceOptionsActivity.this.startActivity(toETHWicklowView);
				break;
				
				case R.id.clinics_satellite:
					Log.d("ButtonLog","Inside case satelitte");
					Intent toSatelitteClinics = new Intent(ServiceOptionsActivity.this, ClinicsSatelliteActivity.class);
					ServiceOptionsActivity.this.startActivity(toSatelitteClinics);
				break;
				
			}
		}
		
	}

}
