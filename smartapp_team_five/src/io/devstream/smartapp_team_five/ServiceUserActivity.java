package io.devstream.smartapp_team_five;

import com.adesina.addlistview.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class ServiceUserActivity extends Activity {
	private Edit edit;
	private Person person;
	private Book_Appointment bookappointment;
	private Address address;
	private Post_natal post_natal;
	private Ante_natal ante_natal;
	private Privious privious;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_service_user);
		
		edit = (Edit)findViewById(R.id.edit);
		person = (Person)findViewById(R.id.person);
		bookappointment = (Bookappointment)findViewById(R.id.bookappointment);
		address = (Address)findViewById(R.id.address);
		post_natal = (Post_natal)findViewById(R.id.post_nata);
		ante_natal = (Ante_natal)findViewById(R.id.ante_natal);
		privious = (Privious)findViewById(R.id.Priviuos);
		
		
		
	}
	
	
}
