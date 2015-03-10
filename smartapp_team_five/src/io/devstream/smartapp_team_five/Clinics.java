package io.devstream.smartapp_team_five;

public class Clinics {
	private String id;

	private String[] announcement_ids;

	private String[] service_option_ids;

	private String recurrence;

	private String appointment_interval;

	//private Days days;

	private String opening_time;

	private String address;

	private String name;

	private String closing_time;

	private Links links;

	private String type;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String[] getAnnouncement_ids() {
		return announcement_ids;
	}

	public void setAnnouncement_ids(String[] announcement_ids) {
		this.announcement_ids = announcement_ids;
	}

	public String[] getService_option_ids() {
		return service_option_ids;
	}

	public void setService_option_ids(String[] service_option_ids) {
		this.service_option_ids = service_option_ids;
	}

	public String getRecurrence() {
		return recurrence;
	}

	public void setRecurrence(String recurrence) {
		this.recurrence = recurrence;
	}

	public String getAppointment_interval() {
		return appointment_interval;
	}

	public void setAppointment_interval(String appointment_interval) {
		this.appointment_interval = appointment_interval;
	}
/*
	public Days getDays() {
		return days;
	}

	public void setDays(Days days) {
		this.days = days;
	}
*/
	public String getOpening_time() {
		return opening_time;
	}

	public void setOpening_time(String opening_time) {
		this.opening_time = opening_time;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClosing_time() {
		return closing_time;
	}

	public void setClosing_time(String closing_time) {
		this.closing_time = closing_time;
	}

	public Links getLinks() {
		return links;
	}

	public void setLinks(Links links) {
		this.links = links;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "ClassPojo [id = " + id + ", announcement_ids = "
				+ announcement_ids + ", service_option_ids = "
				+ service_option_ids + ", recurrence = " + recurrence
				+ ", appointment_interval = " + appointment_interval
				+ ", opening_time = " + opening_time
				+ ", address = " + address + ", name = " + name
				+ ", closing_time = " + closing_time + ", links = " + links
				+ ", type = " + type + "]";
	}
}
