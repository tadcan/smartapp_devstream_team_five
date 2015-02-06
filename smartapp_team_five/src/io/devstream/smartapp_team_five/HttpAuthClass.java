package com.devstream.httpget;

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

public class HttpAuthClass {
	private HttpURLConnection httpcon;
	private String loginURL;
	private String tableURL;
	private String apiKey = "6f9a1abf-443e-4d18-a1a8-93dd39f69d6a";
	
	public HttpAuthClass(String loginURL, String tableURL) {
		this.loginURL = loginURL;
		this.tableURL = tableURL;
		String token = getTheAuthKey(loginURL);
		System.out.println(token);
		accessTheDBTable(token);
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
			byte[] inputBytes = "{\"login\":{\"username\":\"team_andorra\",\"password\":\"smartappiscoming\"}}"
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
	private void accessTheDBTable(String token) {
		URL obj;
		try {
			obj = new URL(tableURL);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			 
			con.setRequestMethod("GET");
	 
			//add request header
			con.setRequestProperty("Api-Key", apiKey);
			con.setRequestProperty("Auth-Token", token);
	 
			int responseCode = con.getResponseCode();
			System.out.println("\nSending 'GET' request to URL : " + tableURL);
			System.out.println("Response Code : " + responseCode);
	 
			BufferedReader in = new BufferedReader(
			        new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
	 
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			//print result
			System.out.println(response.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
