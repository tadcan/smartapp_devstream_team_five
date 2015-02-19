package io.devstream.smartapp_team_five;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ClinicsDominoWicklowActivity extends Activity {
	
	private Button clinicDGreystonesMon;
	private Button clinicDGreystonesTue;
	private Button clinicDKilmacanogue;
	private Button homeVisits;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_clinics_domino_wicklow);
		
		clinicDGreystonesMon = (Button)findViewById(R.id.clinics_domino_greystones_mon);
		clinicDGreystonesMon.setOnClickListener(new ButtonClick() );
			
		clinicDGreystonesTue = (Button)findViewById(R.id.clinics_domino_greystones_tue);
		clinicDGreystonesTue.setOnClickListener(new ButtonClick() );
			
		clinicDKilmacanogue = (Button)findViewById(R.id.clinics_domino_kilmacanogue);
		clinicDKilmacanogue.setOnClickListener(new ButtonClick() );
		
		homeVisits = (Button)findViewById(R.id.home_visits);
		homeVisits.setOnClickListener(new ButtonClick() );
	}
	
	private class ButtonClick implements View.OnClickListener {
		
		public void onClick(View v) {
			
			
			switch( v.getId() ) {
								
				case R.id.clinics_domino_greystones_mon:
					Intent toDGreystonesMonView = new Intent(ClinicsDominoWicklowActivity.this, ClinicDatesActivity.class);
					ClinicsDominoWicklowActivity.this.startActivity(toDGreystonesMonView);
				break;
					
				case R.id.clinics_domino_greystones_tue:
					Intent toDGreystonesTueView = new Intent(ClinicsDominoWicklowActivity.this, ClinicDatesActivity.class);
					ClinicsDominoWicklowActivity.this.startActivity(toDGreystonesTueView);
				break;
				
				case R.id.clinics_domino_kilmacanogue:
					Intent toDKilmacanogueView = new Intent(ClinicsDominoWicklowActivity.this, ClinicDatesActivity.class);
					ClinicsDominoWicklowActivity.this.startActivity(toDKilmacanogueView);
				break;
				
				case R.id.home_visits:
					Intent toHomeVisitsView = new Intent(ClinicsDominoWicklowActivity.this, ClinicDatesActivity.class);
					ClinicsDominoWicklowActivity.this.startActivity(toHomeVisitsView);
				break;
				
			}
		}
		
	}
}