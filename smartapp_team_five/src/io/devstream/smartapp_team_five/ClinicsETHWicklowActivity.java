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
		
		HtmlStyledText htmlST = new HtmlStyledText(this);
		
		clinicEthWicBallinteer = (Button)findViewById(R.id.clinics_eth_w_ballinteer);
		clinicEthWicBallinteer.setOnClickListener(new ButtonClick() );
		clinicEthWicBallinteer.setText(htmlST.htmlStyledText(R.id.clinics_eth_w_ballinteer));
			
		clinicEthWicDunLaoghaire = (Button)findViewById(R.id.clinics_eth_w_dunlaoghaire);
		clinicEthWicDunLaoghaire.setOnClickListener(new ButtonClick() );
		clinicEthWicDunLaoghaire.setText(htmlST.htmlStyledText(R.id.clinics_eth_w_dunlaoghaire));
	}
	
	private class ButtonClick implements View.OnClickListener {
			
			public void onClick(View v) {
				
				
				switch( v.getId() ) {
									
					case R.id.clinics_eth_w_ballinteer:
						Intent toCalenderViewOne = new Intent(ClinicsETHWicklowActivity.this, CalendarActivity.class);
						ClinicsETHWicklowActivity.this.startActivity(toCalenderViewOne);
					break;
						
					case R.id.clinics_eth_w_dunlaoghaire:
						Intent toCalenderViewTwo = new Intent(ClinicsETHWicklowActivity.this, CalendarActivity.class);
						ClinicsETHWicklowActivity.this.startActivity(toCalenderViewTwo);
					break;
				}
			}
			
		}
}
