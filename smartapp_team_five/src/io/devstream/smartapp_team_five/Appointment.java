package io.devstream.smartapp_team_five;
import java.util.Date;
public class Appointment {
    private int id;
    private int service_provider_id;
    private int service_user_id;
    private int clinic_id;
    private String 	priority;          
    private String	visit_type;  
    private Date	date_entered;
    private Date	date;
    
	public Appointment() {
		// TODO Auto-generated constructor stub	
 
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getService_provider_id() {
		return service_provider_id;
	}

	public void setService_provider_id(int service_provider_id) {
		this.service_provider_id = service_provider_id;
	}

	public int getService_user_id() {
		return service_user_id;
	}

	public void setService_user_id(int service_user_id) {
		this.service_user_id = service_user_id;
	}

	public int getClinic_id() {
		return clinic_id;
	}

	public void setClinic_id(int clinic_id) {
		this.clinic_id = clinic_id;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getVisit_type() {
		return visit_type;
	}

	public void setVisit_type(String visit_type) {
		this.visit_type = visit_type;
	}

	public Date getDate_entered() {
		return date_entered;
	}

	public void setDate_entered(Date date_entered) {
		this.date_entered = date_entered;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Appointment [id=" + id + ", service_provider_id="
				+ service_provider_id + ", service_user_id=" + service_user_id
				+ ", clinic_id=" + clinic_id + ", priority=" + priority
				+ ", visit_type=" + visit_type + ", date_entered="
				+ date_entered + ", date=" + date + "]";
	}

}
