package io.devstream.smartapp_team_five;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends Activity {
	
	Button loginIn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		loginIn = (Button)findViewById(R.id.btnLogIn);
		loginIn.setOnClickListener(new ButtonClick() );
		
		
	}
	
	private class ButtonClick implements View.OnClickListener {
			
			public void onClick(View v) {
				
				
				switch( v.getId() ) {
									
					case R.id.btnLogIn:
						Intent toViewAppointmentsView = new Intent(LoginActivity.this, ViewAppointmentsActivity.class);
						LoginActivity.this.startActivity(toViewAppointmentsView);
					break;
				}
			}
			
		}
}
