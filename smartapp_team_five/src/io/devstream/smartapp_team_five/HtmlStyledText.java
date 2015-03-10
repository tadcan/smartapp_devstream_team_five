package io.devstream.smartapp_team_five;

import android.content.Context;
import android.text.Html;

public class HtmlStyledText {
	
	Context context;
	
	HtmlStyledText(Context context) {
		this.context = context;
	}
	
	public CharSequence htmlStyledText(int btnID) {
		
		// Process html tags in strings.xml
		String text = context.getResources().getString(btnID);
		CharSequence styledText = Html.fromHtml(text);
		return styledText;
	}

}
