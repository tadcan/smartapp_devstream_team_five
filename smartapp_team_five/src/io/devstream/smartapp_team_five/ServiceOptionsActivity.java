package io.devstream.smartapp_team_five;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
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
		clinicDominoDublin.setOnClickListener(new ButtonClick() );
		
		clinicDominoWicklow = (Button)findViewById(R.id.clinics_domino_wicklow);
		clinicDominoWicklow.setOnClickListener(new ButtonClick() );
		
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
					// launch intent to service option page
					Intent toDominoDublinView = new Intent(ServiceOptionsActivity.this, ClinicsDublinDominoActivity.class);
					ServiceOptionsActivity.this.startActivity(toDominoDublinView);
				break;
				
				case R.id.clinics_domino_wicklow:
					Intent toDominioWicklowView = new Intent(ServiceOptionsActivity.this, ClinicsWicklowDominoActivity.class);
					ServiceOptionsActivity.this.startActivity(toDominioWicklowView);
				break;
				
				case R.id.clinics_eth_wicklow:
					Intent toETHWicklowView = new Intent(ServiceOptionsActivity.this, ClinicsETHWicklowActivity.class);
					ServiceOptionsActivity.this.startActivity(toETHWicklowView);
				break;
				
				
				case R.id.clinics_eth_dublin:
					Intent toETHDublinView = new Intent(ServiceOptionsActivity.this, ClinicsETHDublinActivity.class);
					ServiceOptionsActivity.this.startActivity(toETHDublinView);
				break;
					
				
				
				case R.id.clinics_satellite:
					Intent toSatelitteClinics = new Intent(ServiceOptionsActivity.this, ClinicsSatelliteActivity.class);
					ServiceOptionsActivity.this.startActivity(toSatelitteClinics);
				break;
				
			}
		}
		
	}
	
	
	
	
	public ServiceOptionsActivity() {
		
	
	}

}
