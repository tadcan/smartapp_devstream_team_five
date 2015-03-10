package io.devstream.smartapp_team_five;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class ToastAlert {

	public ToastAlert(Context context, String message) {
	
		//getContext();  this.getContext(); getApplicationContext(); etc.
		Context mcontext = context.getApplicationContext();  

		// create new Toast object		
		Toast ImageToast = new Toast(mcontext);

		// create new LinearLayout to hold toast	
	    LinearLayout toastLayout = new LinearLayout(mcontext);
	    //toastLayout.setLayoutParams(newLayoutParams);
	    toastLayout.setOrientation(LinearLayout.HORIZONTAL);
	    toastLayout.setBackgroundColor(Color.BLUE);
		toastLayout.setBackgroundResource(R.drawable.rounded_alert);

		   
		// create new ImageView and TextView objects
	    ImageView image = new ImageView(mcontext);
	    TextView tv = new TextView(mcontext);
		// setters for TextView and imageView
	    tv.setText(message);
	    tv.setPadding(8, 8, 8, 8); 
	    image.setImageResource(R.drawable.ic_launcher);
	
	    
		// position at the top of the activity	    
	    ImageToast.setGravity(Gravity.BOTTOM, 0, 0);
	    toastLayout.addView(image);
	    toastLayout.addView(tv);
	    ImageToast.setView(toastLayout);
	    ImageToast.setDuration(Toast.LENGTH_SHORT);
	    ImageToast.show();
	}
}
