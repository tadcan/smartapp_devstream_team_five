<<<<<<< HEAD
package io.devstream.smartapp_team_five;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class ClinicDatesActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_clinic_dates);
		
		Intent intent = new Intent(ClinicDatesActivity.this, CalendarActivity.class);
		startActivity(intent);
	}
}
=======
package io.devstream.smartapp_team_five;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class ClinicDatesActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_clinic_dates);
		
		//Intent intent = new Intent(ClinicDatesActivity.this, CalendarActivity.class,);
		//startActivity(intent);
	}
}
>>>>>>> ea6ec5f57395d1ecfdb5e09d6006b1024af19aab
