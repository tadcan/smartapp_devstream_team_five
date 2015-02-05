package io.devstream.smartapp_team_five;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ClinicsDublinDominoActivity extends Activity {

	private Button clinicDdNmhOpd;
	private Button clinicDdLeopardstown;
	private Button clinicDdDunLaoghaire;
	private Button clinicDdChurchtown;
	private Button clinicSatellite;
	private Button homeVisits;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_clinics_dublin_domino);
		
		// set buttons for page
			clinicDdNmhOpd = (Button)findViewById(R.id.clinics_d_d_nmh_opd);
			clinicDdNmhOpd.setOnClickListener(new ButtonClick() );
				
			clinicDdLeopardstown = (Button)findViewById(R.id.clinics_d_d_leopardstown);
			clinicDdLeopardstown.setOnClickListener(new ButtonClick() );
				
			clinicDdDunLaoghaire = (Button)findViewById(R.id.clinics_d_d_dun_laoghaire);
			clinicDdDunLaoghaire.setOnClickListener(new ButtonClick() );
				
			clinicDdChurchtown = (Button)findViewById(R.id.clinics_d_d_churchtown);
			clinicDdChurchtown.setOnClickListener(new ButtonClick() );
				
			clinicSatellite = (Button)findViewById(R.id.clinics_satellite);
			clinicSatellite.setOnClickListener(new ButtonClick() );
			
			homeVisits = (Button)findViewById(R.id.home_visits);
			homeVisits.setOnClickListener(new ButtonClick() );
				
		
	}
	
	private class ButtonClick implements View.OnClickListener {
			
			public void onClick(View v) {
				
				
				switch( v.getId() ) {
					case R.id.clinics_d_d_nmh_opd:
						// launch intent to service option page
						Intent toDdNmhOpdView = new Intent(ClinicsDublinDominoActivity.this, ClinicDatesActivity.class);
						ClinicsDublinDominoActivity.this.startActivity(toDdNmhOpdView);
					break;
					
					case R.id.clinics_d_d_leopardstown:
						Intent toDdLeopardstownView = new Intent(ClinicsDublinDominoActivity.this, ClinicDatesActivity.class);
						ClinicsDublinDominoActivity.this.startActivity(toDdLeopardstownView);
					break;
					
					case R.id.clinics_d_d_dun_laoghaire:
						Intent toDdDunLaoghaireView = new Intent(ClinicsDublinDominoActivity.this, ClinicDatesActivity.class);
						ClinicsDublinDominoActivity.this.startActivity(toDdDunLaoghaireView);
					break;
					
					
					case R.id.clinics_d_d_churchtown:
						Intent toDdChurchTownView = new Intent(ClinicsDublinDominoActivity.this, ClinicDatesActivity.class);
						ClinicsDublinDominoActivity.this.startActivity(toDdChurchTownView);
					break;
						
					case R.id.clinics_satellite:
						Intent toSatelitteClinics = new Intent(ClinicsDublinDominoActivity.this, ClinicDatesActivity.class);
						ClinicsDublinDominoActivity.this.startActivity(toSatelitteClinics);
					break;
					
					case R.id.home_visits:
						Intent toHomeVisitsView = new Intent(ClinicsDublinDominoActivity.this, ClinicDatesActivity.class);
						ClinicsDublinDominoActivity.this.startActivity(toHomeVisitsView);
					break;
					
				}
			}
			
		}
}
