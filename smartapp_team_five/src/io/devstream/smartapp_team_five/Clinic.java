package io.devstream.smartapp_team_five;

public class Clinic {
	
	private int clinicID;
	private String clinicName;
	private String clinicAddress;
	private String clinicOpeningTime;
	private String clinicClosingTime;
	private String userRecurrance;
	private String type;
	private int appointmentInterval;
	
	private int announcementID;
	private String providersNote;
	private String announcementDate;
	private boolean blocking;
	
	Clinic() {
		
	}
	
	// Parameters for the creation of a clinic
	Clinic(int clinicID, String clinicName, String clinicAddress, String clinicOpeningTime, String clinicClosingTime, 
			String userRecurrance, String type, int appointmentInterval) {
		
		this.clinicID = clinicID;
		this.clinicName = clinicName;
		this.clinicAddress = clinicAddress;
		this.clinicOpeningTime = clinicOpeningTime;
		this.clinicClosingTime = clinicClosingTime;
		this.userRecurrance = userRecurrance;
		this.type = type;
		this.appointmentInterval = appointmentInterval;
	}
	
	// Parameters for an announcement
	Clinic(int announcementID, String providersNote, String announcementDate, boolean blocking) {
		
		this.announcementID = announcementID;
		this.providersNote = providersNote;
		this.announcementDate = announcementDate;
		this.blocking = blocking;
	}
	
	public int getClinicID() {
		return clinicID;
	}
	
	public String getClinicName() {
		return clinicName;
	}
	
	public String getClinicAddress() {
		return clinicAddress;
	}
	
	public String getClinicOpeningTime() {
		return clinicOpeningTime;
	}
	
	public String getClinicClosingTime() {
		return clinicClosingTime;
	}
	
	public String getUserRecurrance() {
		return userRecurrance;
	}
	
	public String getType() {
		return type;
	}
	public int getAppointmentInterval() {
		return appointmentInterval;
	}
	public int getAnnouncementID() {
		return announcementID;
	}
	public String getProvidersNote() {
		return providersNote;
	}
	public String getAnnouncementDate() {
		return announcementDate;
	}
	public boolean isBlocking() {
		return blocking;
	}
	
	
	public void setClinicID(int clinicID) {
		this.clinicID = clinicID;
	}
	public void setClinicName(String clinicName) {
		this.clinicName = clinicName;
	}
	public void setClinicAddress(String clinicAddress) {
		this.clinicAddress = clinicAddress;
	}
	public void setClinicOpeningTime(String clinicOpeningTime) {
		this.clinicOpeningTime = clinicOpeningTime;
	}
	public void setClinicClosingTime(String clinicClosingTime) {
		this.clinicClosingTime = clinicClosingTime;
	}
	public void setUserRecurrance(String userRecurrance) {
		this.userRecurrance = userRecurrance;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setAppointmentInterval(int appointmentInterval) {
		this.appointmentInterval = appointmentInterval;
	}
	public void setAnnouncementID(int announcementID) {
		this.announcementID = announcementID;
	}
	public void setProvidersNote(String providersNote) {
		this.providersNote = providersNote;
	}
	public void setAnnouncementDate(String announcementDate) {
		this.announcementDate = announcementDate;
	}
	public void setBlocking(boolean blocking) {
		this.blocking = blocking;
	}
	
	@Override
	public String toString() {
		return "[" + "Clinic clinicID = " + clinicID + ", clinicName = " + clinicName
				+ ", clinicAddress = " + clinicAddress + ", clinicOpeningTime =  "
				+ clinicOpeningTime + ", clinicClosingTime = " 
				+ clinicClosingTime + ", userRecurrance = " + userRecurrance
				+ ", type = " + type + ", appointmentInterval = "
				+ appointmentInterval + ", announcementID=" + announcementID
				+ ", providersNote = " + providersNote + ", announcementDate = "
				+ announcementDate + ", blocking = " + blocking + ", getClass() = "
				+ getClass() + ", hashCode() = " + hashCode() + ", toString() = "
				+ super.toString() + "]";
	}
	
}
