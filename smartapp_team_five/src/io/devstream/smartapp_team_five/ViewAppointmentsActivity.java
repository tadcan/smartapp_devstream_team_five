package io.devstream.smartapp_team_five;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ViewAppointmentsActivity extends Activity {

	private Button clinicsAnteNatal;
	private Button visitsPostNatal;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_view_appointments);
		
		// set the button id to field variable
		clinicsAnteNatal = (Button)findViewById(R.id.clinics_landing_page);
		// when button pressed have it follow logic in private class
		clinicsAnteNatal.setOnClickListener(new ButtonClick());
		
		visitsPostNatal = (Button)findViewById(R.id.visits_landing_page);
		visitsPostNatal.setOnClickListener(new ButtonClick() );
	}
	
	private class ButtonClick implements View.OnClickListener {
		
		public void onClick(View v) {
			
			
			switch( v.getId() ) {
				case R.id.clinics_landing_page:
					// launch intent to service option page
					Intent toServiceOptionsView = new Intent(ViewAppointmentsActivity.this, ServiceOptionsActivity.class);
					ViewAppointmentsActivity.this.startActivity(toServiceOptionsView);
				break;
				
				case R.id.visits_landing_page:
					// launch intent to visits post natal calendar
				break;
				
				default:
					// error toast?
				
			}
			
			
			
			
			// launch intent to visits post natal calendar
		}
		
	}
	
	
}
