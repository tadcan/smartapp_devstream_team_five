package io.devstream.smartapp_team_five;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class ViewAppointments extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle(R.string.title_activity_view_appointments);
		setContentView(R.layout.activity_view_appointments);
	}
}
