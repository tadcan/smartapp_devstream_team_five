package io.devstream.smartapp_team_five;
//
public class ServiceUser {
	private String fname;
	private String lname;
	private String id;
	private String address;
 	private int age;
 	private String pps;
 	private int contact;
	
	public ServiceUser(String theFname,String theLname, String theId, String theAddress, int theAge,String thePps, int theContact) {
		// TODO Auto-generated constructor stub
		fname = theFname;
    	lname = theLname;
		pps = thePps;
		age  = theAge;
		address = theAddress;
		contact = theContact;
	}
	public String getFname() {
		return fname;
	}
	
	public String getLname() {
		return lname;
	}
	
	public String getPps() {
		return pps;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getAddress() {
		return address;
	}
	public String getId() {
		return id;
	}
	public int getContact() {
		return contact;
	}
	
	public String toString() {
		return "\nName: "+ fname + " \nLast Name: " + lname + "\nThe address:" + address + "\nAge:" + age + "\nPPS:" + pps + "\nID:" + id + "\nContact:" + contact ;
	}
 
 }
