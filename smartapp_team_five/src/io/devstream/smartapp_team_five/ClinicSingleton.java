package io.devstream.smartapp_team_five;

import org.json.JSONArray;
import org.json.JSONObject;

public class ClinicSingleton {
	private static ClinicSingleton singleInstance;
	private JSONArray queryArray = new JSONArray();
	
	public static ClinicSingleton getSingletonIntance() {
		if(singleInstance == null) {
			singleInstance = new ClinicSingleton();
		}
		return singleInstance;
	}


	public JSONArray getQueryArray() {
		return queryArray;
	}
	public void setQueryArray(JSONArray queryArray) {
		this.queryArray = queryArray;
	}

	@Override
	public String toString() {
		return "ClinicSingleton [queryArray=" + queryArray + "]";
	}
}
