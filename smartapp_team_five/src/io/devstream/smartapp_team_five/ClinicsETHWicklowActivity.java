package io.devstream.smartapp_team_five;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ClinicsETHWicklowActivity extends Activity {

	private Button clinicEthWicBallinteer;
	private Button clinicEthWicDunLaoghaire;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_clinics_eth_wicklow);
		
		clinicEthWicBallinteer = (Button)findViewById(R.id.clinics_eth_w_ballinteer);
		clinicEthWicBallinteer.setOnClickListener(new ButtonClick() );
			
		clinicEthWicDunLaoghaire = (Button)findViewById(R.id.clinics_eth_w_dunlaoghaire);
		clinicEthWicDunLaoghaire.setOnClickListener(new ButtonClick() );
	}
	
	private class ButtonClick implements View.OnClickListener {
			
			public void onClick(View v) {
				
				
				switch( v.getId() ) {
									
					case R.id.clinics_eth_w_ballinteer:
						Intent toEthWicBallinteerView = new Intent(ClinicsETHWicklowActivity.this, ClinicDatesActivity.class);
						ClinicsETHWicklowActivity.this.startActivity(toEthWicBallinteerView);
					break;
						
					case R.id.clinics_eth_w_dunlaoghaire:
						Intent toEthWicDunLaoghaireView = new Intent(ClinicsETHWicklowActivity.this, ClinicDatesActivity.class);
						ClinicsETHWicklowActivity.this.startActivity(toEthWicDunLaoghaireView);
					break;
				}
			}
			
		}
}
