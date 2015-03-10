package io.devstream.smartapp_team_five;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends Activity {
	private static final String TAG = "jpmain";
	private EditText  username;
	private EditText  password;
	private TextView attempts;
	Button login;	


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		username = (EditText)findViewById(R.id.etUserName);
		password = (EditText)findViewById(R.id.etPass);		
		login = (Button)findViewById(R.id.btnLogIn);
		login.setOnClickListener(new ButtonClick() );
		
		
	}
	
	private class ButtonClick implements View.OnClickListener {		
			public void onClick(View v) {				
				switch( v.getId() ) {								
					case R.id.btnLogIn:
						Intent toViewAppointmentsView = new Intent(LoginActivity.this, ViewAppointmentsActivity.class);
						//LoginActivity.this.startActivity(toViewAppointmentsView);
						startActivity(toViewAppointmentsView);
					break;
				}
			}			
		}
}