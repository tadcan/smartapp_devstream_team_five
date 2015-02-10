package io.devstream.smartapp_team_five;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class CalenderActivity extends Activity implements AdapterView.OnItemClickListener, View.OnClickListener {
   
//   public class CalenderActivity extends ActionBarActivity {



	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.calender, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}



 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView list = new ListView(this);
        setContentView(list);
        
        String[] items = {"Tom Murphy", "Sally", "Bill Doyle", "John", "Sue Boyle", "Isabella"};
        //Supply this adapter with either R.layout.row_button, R.layout.row_view, or R.layout.row_view_noparent
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.row_view, R.id.text, items) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View row =  super.getView(position, convertView, parent);

                View left = row.findViewById(R.id.left);
                left.setTag(position);
                left.setOnClickListener(MyActivity.this);
                View right = row.findViewById(R.id.right);
                right.setTag(position);
                right.setOnClickListener(MyActivity.this);
                
                return row;
            }
        };
        
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);
    }
    
    @Override
    public void onClick(View v) {
        switch(v.getId()) {
        case R.id.left:
            Toast.makeText(this, "Left Accessory "+v.getTag(), Toast.LENGTH_SHORT).show();
            break;
        case R.id.right:
            Toast.makeText(this, "Right Accessory "+v.getTag(), Toast.LENGTH_SHORT).show();
            break;
        default:
            break;
        }
    }
    
    @Override
    public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
        Toast.makeText(this, "Item Click "+position, Toast.LENGTH_SHORT).show();
    }
}