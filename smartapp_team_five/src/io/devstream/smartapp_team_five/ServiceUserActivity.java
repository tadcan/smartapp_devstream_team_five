package io.devstream.smartapp_team_five;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ServiceUserActivity extends Activity {
	   
		private Button Edit;
		private Button Ante_natal;
		private Button Post_natal;
		
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_service_user);
		
		  	  
		    Edit = (Button)findViewById(R.id.label_2 );
		    Edit.setOnClickListener(new ButtonClick());
		    
			Ante_natal = (Button)findViewById(R.id.label_3 );
			Ante_natal.setOnClickListener(new ButtonClick());
			
			Post_natal = (Button)findViewById(R.id.label_4 );
			Post_natal.setOnClickListener(new ButtonClick());
		
			
				
	}
	
private class ButtonClick implements View.OnClickListener {
		
		public void onClick(View v) {
		
			switch( v.getId() ) {
			
			case R.id.label_2:
				// launch intent 
				
			break;
			
			case R.id.label_3:
				// launch intent 
				
			break;
			
			case R.id.label_4:
				// launch intent 
			
			default:
						
							
			}			
			
			
		}
			
		
	}
}		
	

	


