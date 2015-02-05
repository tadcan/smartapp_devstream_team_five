package io.devstream.smartapp_team_five;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ClinicsSatelliteActivity extends Activity {
	
	private Button clinicSatelliteGreystones;
	private Button clinicSatelliteArklow;
	private Button clinicSatelliteNewtownmountkennedy;
	private Button clinicSatelliteBray;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_clinics_satellite);
		
		clinicSatelliteGreystones = (Button)findViewById(R.id.clinics_satellite_greystones);
		clinicSatelliteGreystones.setOnClickListener(new ButtonClick() );
			
		clinicSatelliteArklow = (Button)findViewById(R.id.clinics_satellite_arklow);
		clinicSatelliteArklow.setOnClickListener(new ButtonClick() );
		
		clinicSatelliteNewtownmountkennedy = (Button)findViewById(R.id.clinics_satellite_newtownmountkennedy);
		clinicSatelliteNewtownmountkennedy.setOnClickListener(new ButtonClick() );
			
		clinicSatelliteBray = (Button)findViewById(R.id.clinics_eth_d_dunlaoghaire);
		clinicSatelliteBray.setOnClickListener(new ButtonClick() );
	}
	
	private class ButtonClick implements View.OnClickListener {
			
			public void onClick(View v) {
				
				
				switch( v.getId() ) {
									
					case R.id.clinics_satellite_greystones:
						Intent toSatelitteGreystonesView = new Intent(ClinicsSatelliteActivity.this, ClinicDatesActivity.class);
						ClinicsSatelliteActivity.this.startActivity(toSatelitteGreystonesView);
					break;
						
					case R.id.clinics_satellite_arklow:
						Intent toSatelitteArklowView = new Intent(ClinicsSatelliteActivity.this, ClinicDatesActivity.class);
						ClinicsSatelliteActivity.this.startActivity(toSatelitteArklowView);
					break;
					
					case R.id.clinics_satellite_newtownmountkennedy:
						Intent toSatelitteNewtownmountkennedyView = new Intent(ClinicsSatelliteActivity.this, ClinicDatesActivity.class);
						ClinicsSatelliteActivity.this.startActivity(toSatelitteNewtownmountkennedyView);
					break;
						
					case R.id.clinics_satellite_bray:
						Intent toSatelitteBrayView = new Intent(ClinicsSatelliteActivity.this, ClinicDatesActivity.class);
						ClinicsSatelliteActivity.this.startActivity(toSatelitteBrayView);
					break;
				}
			}
			
		}
}
