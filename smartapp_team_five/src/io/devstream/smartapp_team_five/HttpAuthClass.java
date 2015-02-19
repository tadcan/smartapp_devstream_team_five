package io.devstream.smartapp_team_five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import org.json.JSONException;
import org.json.JSONObject;

import android.util.Log;


public class HttpAuthClass {
	private HttpURLConnection httpcon;
	private String loginURL;
	private String tableURL;
	private String apiKey = "f95a26e5-38d3-4161-b9c1-acb2cfc151c6";
	private  JSONObject jsonobj;
	//                       f95a26e5­38d3­4161­b9c1­acb2cfc151c6
	//apikey>f95a26e5­38d3­4161­b9c1­acb2cfc151c6
	//token>fee3d8dcde4b9feff85c

	public HttpAuthClass(String loginURL, String tableURL) {
		this.loginURL = loginURL;
		this.tableURL = tableURL;
		String token = getTheAuthKey(loginURL);
		System.out.println(token);
		this.jsonobj=getJSON(token);
		
	}


	public   JSONObject getJsonobj() {
		return jsonobj;
	}


	// get the auth key
	private String getTheAuthKey(String loginURL) {
		try {
			httpcon = (HttpURLConnection) ((new URL(loginURL).openConnection()));
			URLEncoder.encode(loginURL,"UTF-8");
			httpcon.setDoOutput(true);
			httpcon.setRequestProperty("Content-Type", "application/json");
			httpcon.setRequestProperty("Accept", "application/json");
			httpcon.setRequestMethod("POST");
			httpcon.connect();
			// form request
			byte[] inputBytes = "{\"login\":{\"username\":\"team_eritrea\",\"password\":\"smartappiscoming\"}}"
					.getBytes("UTF-8");
			OutputStream os = httpcon.getOutputStream();
			os.write(inputBytes);
			System.out.println(os.toString());
			os.close();
			// grab the response
			InputStream is = httpcon.getInputStream();
		    int ch;
		    StringBuffer sb = new StringBuffer();
		    while ((ch = is.read()) != -1) {
		        sb.append((char) ch);
		      }
		      System.out.println(sb.toString());
		      String st = sb.toString();
		      
		      // create JSON Object to get Token using token key
		      JSONObject json = new JSONObject(st);
		      String strToken = (String) ((JSONObject) json.get("login")).get("token");
		      System.out.println(strToken);
		      httpcon.disconnect();
		      return strToken;
		} catch (IOException | JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}return null;		
	}
	
	// using the auth key and api key we can access the database
	private  JSONObject getJSON(String token) {

		URL obj;
		String result = "";
		JSONObject jArray = null;
		Log.d("jp1!", "jp03");
		try {
			obj = new URL(tableURL);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			 
			con.setRequestMethod("GET");
	 
			//add request header
			con.setRequestProperty("Api-Key", apiKey);
			con.setRequestProperty("Auth-Token", token);
			System.out.println("apikey>"+apiKey + "\ntoken>" +token);
			
			int responseCode = con.getResponseCode();
			
			System.out.println("\nSending 'GET' request to URL : " + tableURL);
			System.out.println("Response Code : " + responseCode);
	 
		
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
	 
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			//print result
			result = response.toString();
			System.out.println(result);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			jArray = new JSONObject(result);
		} catch (JSONException e) {
			Log.e("log_tag", "Error parsing data " + e.toString());
		}
		Log.d("jp1!", "jp04");
		return jArray;
	}
}
