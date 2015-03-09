package io.devstream.smartapp_team_five;

//  http://pojo.sodhanalibrary.com/Convert

public class Appointment
{
    private String id;

    private String time;

    private String[] service_option_ids;

    private String clinic_id;

    private String service_provider_id;

    private String priority;

    private String service_user_id;

    private Links links;

    private String visit_type;

    private String[] visit_logs;

    private String date;

    //private ServiceUser serviceUser;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getTime ()
    {
        return time;
    }

    public void setTime (String time)
    {
        this.time = time;
    }

    public String[] getService_option_ids ()
    {
        return service_option_ids;
    }

    public void setService_option_ids (String[] service_option_ids)
    {
        this.service_option_ids = service_option_ids;
    }

    public String getClinic_id ()
    {
        return clinic_id;
    }

    public void setClinic_id (String clinic_id)
    {
        this.clinic_id = clinic_id;
    }

    public String getService_provider_id ()
    {
        return service_provider_id;
    }

    public void setService_provider_id (String service_provider_id)
    {
        this.service_provider_id = service_provider_id;
    }

    public String getPriority ()
    {
        return priority;
    }

    public void setPriority (String priority)
    {
        this.priority = priority;
    }

    public String getService_user_id ()
    {
        return service_user_id;
    }

    public void setService_user_id (String service_user_id)
    {
        this.service_user_id = service_user_id;
    }

    public Links getLinks ()
    {
        return links;
    }

    public void setLinks (Links links)
    {
        this.links = links;
    }

    public String getVisit_type ()
    {
        return visit_type;
    }

    public void setVisit_type (String visit_type)
    {
        this.visit_type = visit_type;
    }

    public String[] getVisit_logs ()
    {
        return visit_logs;
    }

    public void setVisit_logs (String[] visit_logs)
    {
        this.visit_logs = visit_logs;
    }

    public String getDate ()
    {
        return date;
    }

    public void setDate (String date)
    {
        this.date = date;
    }
/*
    public ServiceUser getServiceUser ()
    {
        return serviceUser;
    }



	public void setServiceUser (ServiceUser serviceUser)
    {
        this.serviceUser = serviceUser;
    }
    */
}
