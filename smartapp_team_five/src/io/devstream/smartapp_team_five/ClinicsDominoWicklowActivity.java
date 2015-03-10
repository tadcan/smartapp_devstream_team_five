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
					Intent toCalenderViewOne = new Intent(ClinicsDominoWicklowActivity.this, CalendarActivity.class);
					ClinicsDominoWicklowActivity.this.startActivity(toCalenderViewOne);
				break;
					
				case R.id.clinics_domino_greystones_tue:
					Intent toCalenderViewTwo = new Intent(ClinicsDominoWicklowActivity.this, CalendarActivity.class);
					ClinicsDominoWicklowActivity.this.startActivity(toCalenderViewTwo);
				break;
				
				case R.id.clinics_domino_kilmacanogue:
					Intent toCalenderViewThree = new Intent(ClinicsDominoWicklowActivity.this, CalendarActivity.class);
					ClinicsDominoWicklowActivity.this.startActivity(toCalenderViewThree);
				break;
				
				case R.id.home_visits:
					Intent toCalenderViewFour = new Intent(ClinicsDominoWicklowActivity.this, CalendarActivity.class);
					ClinicsDominoWicklowActivity.this.startActivity(toCalenderViewFour);
				break;
				
			}
		}
		
	}
}
