package io.devstream.smartapp_team_five;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ClinicsETHDublinActivity extends Activity {
	
	private Button clinicEthDubBallinteer;
	private Button clinicEthDubDunLaoghaire;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_clinics_eth_dublin);
		
		clinicEthDubBallinteer = (Button)findViewById(R.id.clinics_eth_d_ballinteer);
		clinicEthDubBallinteer.setOnClickListener(new ButtonClick() );
			
		clinicEthDubDunLaoghaire = (Button)findViewById(R.id.clinics_eth_d_dunlaoghaire);
		clinicEthDubDunLaoghaire.setOnClickListener(new ButtonClick() );
	}
	
private class ButtonClick implements View.OnClickListener {
		
		public void onClick(View v) {
			
			
			switch( v.getId() ) {
								
				case R.id.clinics_eth_d_ballinteer:
					Intent toEthDBallinteerView = new Intent(ClinicsETHDublinActivity.this, ClinicDatesActivity.class);
					ClinicsETHDublinActivity.this.startActivity(toEthDBallinteerView);
				break;
					
				case R.id.clinics_eth_d_dunlaoghaire:
					Intent toEthDDunLaoghaireView = new Intent(ClinicsETHDublinActivity.this, ClinicDatesActivity.class);
					ClinicsETHDublinActivity.this.startActivity(toEthDDunLaoghaireView);
				break;
			}
		}
		
	}
}
