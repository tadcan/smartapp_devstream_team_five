package io.devstream.smartapp_team_five;

import org.json.JSONArray;
import org.json.JSONObject;

public class Singleton {
	private static Singleton singleInstance;
	public static final String ipAddr="http://54.72.7.91:8888/";
	private JSONObject queryObject = new JSONObject();
	private JSONArray queryArray = new JSONArray();
	
	private ServiceProviders midWife;
	private JSONArray clinics = new JSONArray();
	private JSONArray appointments = new JSONArray();
	
	
	public static Singleton getSingletonIntance() {
		if(singleInstance == null) {
			singleInstance = new Singleton();
		}
		return singleInstance;
	}

	public JSONObject getQueryObject() {
		return queryObject;
	}
	public void setQueryObject(JSONObject queryObject) {
		this.queryObject = queryObject;
	}

	public JSONArray getQueryArray() {
		return queryArray;
	}
	public void setQueryArray(JSONArray queryArray) {
		this.queryArray = queryArray;
	}
	@Override
	public String toString() {
		return "Singleton [queryObject=" + queryObject + "]";
	}
}
