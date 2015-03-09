package io.devstream.smartapp_team_five;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ClinicsDominoDublinActivity extends Activity {

	private Button clinicDdNmhOpd; // Trying to style the button
	private Button clinicDdLeopardstown;
	private Button clinicDdDunLaoghaire;
	private Button clinicDdChurchtown;
	private Button clinicSatellite;
	private Button homeVisits;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_clinics_domino_dublin);
		
		HtmlStyledText htmlST = new HtmlStyledText(this);
		
		
		// set buttons for page
		clinicDdNmhOpd = (Button) findViewById(R.id.btn_clinics_d_d_nmh_opd);
		clinicDdNmhOpd.setOnClickListener(new ButtonClick());
		clinicDdNmhOpd.setText(htmlST.htmlStyledText(R.string.btnText_d_d_nmh_opd));
		
		
		clinicDdLeopardstown = (Button) findViewById(R.id.btn_clinics_d_d_leopardstown);
		clinicDdLeopardstown.setOnClickListener(new ButtonClick());
		clinicDdLeopardstown.setText(htmlST.htmlStyledText(R.string.btnText_d_d_leopardstown));
		

		clinicDdDunLaoghaire = (Button) findViewById(R.id.btn_clinics_d_d_dun_laoghaire);
		clinicDdDunLaoghaire.setOnClickListener(new ButtonClick());
		clinicDdDunLaoghaire.setText(htmlST.htmlStyledText(R.string.btnText_d_d_dun_laoghaire));
		

		clinicDdChurchtown = (Button) findViewById(R.id.btn_clinics_d_d_churchtown);
		clinicDdChurchtown.setOnClickListener(new ButtonClick());
		clinicDdChurchtown.setText(htmlST.htmlStyledText(R.string.btnText_d_d_churchtown));

		clinicSatellite = (Button) findViewById(R.id.btn_clinics_satellite);
		clinicSatellite.setOnClickListener(new ButtonClick());
		clinicSatellite.setText(htmlST.htmlStyledText(R.string.btnText_salellite));

		homeVisits = (Button) findViewById(R.id.btn_home_visits);
		homeVisits.setOnClickListener(new ButtonClick());
		homeVisits.setText(htmlST.htmlStyledText(R.string.btnText_home_visits));
	
	}
	
	private class ButtonClick implements View.OnClickListener {

		public void onClick(View v) {

			switch (v.getId()) {
			case R.id.btn_clinics_d_d_nmh_opd:
				// launch intent to service option page
				Intent toDdNmhOpdView = new Intent(
						ClinicsDominoDublinActivity.this,
						ClinicDatesActivity.class);
				ClinicsDominoDublinActivity.this.startActivity(toDdNmhOpdView);
				break;

			case R.id.btn_clinics_d_d_leopardstown:
				Intent toDdLeopardstownView = new Intent(
						ClinicsDominoDublinActivity.this,
						ClinicDatesActivity.class);
				ClinicsDominoDublinActivity.this
						.startActivity(toDdLeopardstownView);
				break;

			case R.id.btn_clinics_d_d_dun_laoghaire:
				Intent toDdDunLaoghaireView = new Intent(
						ClinicsDominoDublinActivity.this,
						ClinicDatesActivity.class);
				ClinicsDominoDublinActivity.this
						.startActivity(toDdDunLaoghaireView);
				break;

			case R.id.btn_clinics_d_d_churchtown:
				Intent toDdChurchTownView = new Intent(
						ClinicsDominoDublinActivity.this,
						ClinicDatesActivity.class);
				ClinicsDominoDublinActivity.this
						.startActivity(toDdChurchTownView);
				break;

			case R.id.btn_clinics_satellite:
				Intent toSatelitteClinics = new Intent(
						ClinicsDominoDublinActivity.this,
						ClinicDatesActivity.class);
				ClinicsDominoDublinActivity.this
						.startActivity(toSatelitteClinics);
				break;

			case R.id.btn_home_visits:
				Intent toHomeVisitsView = new Intent(
						ClinicsDominoDublinActivity.this,
						ClinicDatesActivity.class);
				ClinicsDominoDublinActivity.this
						.startActivity(toHomeVisitsView);
				break;

			}
		}

	}
}
