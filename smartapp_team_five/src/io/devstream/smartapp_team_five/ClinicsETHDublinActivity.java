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
		
		HtmlStyledText htmlST = new HtmlStyledText(this);
		
		clinicEthDubBallinteer = (Button)findViewById(R.id.clinics_eth_d_ballinteer);
		clinicEthDubBallinteer.setOnClickListener(new ButtonClick() );
		clinicEthDubBallinteer.setText(htmlST.htmlStyledText(R.id.clinics_eth_d_ballinteer));
			
		clinicEthDubDunLaoghaire = (Button)findViewById(R.id.clinics_eth_d_dunlaoghaire);
		clinicEthDubDunLaoghaire.setOnClickListener(new ButtonClick() );
		clinicEthDubDunLaoghaire.setText(htmlST.htmlStyledText(R.id.clinics_eth_d_dunlaoghaire));
	}
	
private class ButtonClick implements View.OnClickListener {
		
		public void onClick(View v) {
			
			
			switch( v.getId() ) {
								
				case R.id.clinics_eth_d_ballinteer:
					Intent toCalenderViewOne = new Intent(ClinicsETHDublinActivity.this, CalendarActivity.class);
					ClinicsETHDublinActivity.this.startActivity(toCalenderViewOne);
				break;
					
				case R.id.clinics_eth_d_dunlaoghaire:
					Intent toCalenderViewTwo = new Intent(ClinicsETHDublinActivity.this, CalendarActivity.class);
					ClinicsETHDublinActivity.this.startActivity(toCalenderViewTwo);
				break;
			}
		}
		
	}
}
