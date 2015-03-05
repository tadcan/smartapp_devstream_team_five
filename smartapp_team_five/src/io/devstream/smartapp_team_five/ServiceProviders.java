package io.devstream.smartapp_team_five;

public class ServiceProviders {

	private String job_level;

	private String id;

	private String username;

	private String secondary_phone;

	private String job_occupation;

	private String email;

	private String admin;

	private String name;

	private String primary_phone;

	private String active;

	private String password;

	public String getJob_level() {
		return job_level;
	}

	public void setJob_level(String job_level) {
		this.job_level = job_level;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSecondary_phone() {
		return secondary_phone;
	}

	public void setSecondary_phone(String secondary_phone) {
		this.secondary_phone = secondary_phone;
	}

	public String getJob_occupation() {
		return job_occupation;
	}

	public void setJob_occupation(String job_occupation) {
		this.job_occupation = job_occupation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdmin() {
		return admin;
	}

	public void setAdmin(String admin) {
		this.admin = admin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrimary_phone() {
		return primary_phone;
	}

	public void setPrimary_phone(String primary_phone) {
		this.primary_phone = primary_phone;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "ClassPojo [job_level = " + job_level + ", id = " + id
				+ ", username = " + username + ", secondary_phone = "
				+ secondary_phone + ", job_occupation = " + job_occupation
				+ ", email = " + email + ", admin = " + admin + ", name = "
				+ name + ", primary_phone = " + primary_phone + ", active = "
				+ active + ", password = " + password + "]";
	}
}
