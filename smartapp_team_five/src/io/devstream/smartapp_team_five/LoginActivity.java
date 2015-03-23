package io.devstream.smartapp_team_five;



import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends Activity {
	private static final String TAG = "jpmain";
	private EditText  username;
	private EditText  password;
	private TextView attempts;
	Button login;	
	Boolean validUser = true;

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
						//checkIfValidUser;
					if (validUser) {
						Intent toViewAppointmentsView = new Intent(LoginActivity.this, ViewAppointmentsActivity.class);
						//LoginActivity.this.startActivity(toViewAppointmentsView);
						startActivity(toViewAppointmentsView);
					}
					else
					{
						// Write your code here to execute after dialog closed
				         Toast.makeText(getApplicationContext(),"Invalid User", Toast.LENGTH_SHORT).show();
						break;
					}
				}
			}			
		}
}