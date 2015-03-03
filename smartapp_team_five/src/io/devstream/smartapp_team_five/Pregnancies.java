package io.devstream.smartapp_team_five;

public class Pregnancies
{
    private String id;

    private String[] baby_ids;

    private String anti_d;

    private null gestation;

    private String additional_info;

    private String perineum;

    private String feeding;

    private String created_at;

    private String service_user_id;

    private null estimated_delivery_date;

    private String last_menstrual_period;

    private String[] birth_mode;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String[] getBaby_ids ()
    {
        return baby_ids;
    }

    public void setBaby_ids (String[] baby_ids)
    {
        this.baby_ids = baby_ids;
    }

    public String getAnti_d ()
    {
        return anti_d;
    }

    public void setAnti_d (String anti_d)
    {
        this.anti_d = anti_d;
    }

    public null getGestation ()
    {
        return gestation;
    }

    public void setGestation (null gestation)
    {
        this.gestation = gestation;
    }

    public String getAdditional_info ()
    {
        return additional_info;
    }

    public void setAdditional_info (String additional_info)
    {
        this.additional_info = additional_info;
    }

    public String getPerineum ()
    {
        return perineum;
    }

    public void setPerineum (String perineum)
    {
        this.perineum = perineum;
    }

    public String getFeeding ()
    {
        return feeding;
    }

    public void setFeeding (String feeding)
    {
        this.feeding = feeding;
    }

    public String getCreated_at ()
    {
        return created_at;
    }

    public void setCreated_at (String created_at)
    {
        this.created_at = created_at;
    }

    public String getService_user_id ()
    {
        return service_user_id;
    }

    public void setService_user_id (String service_user_id)
    {
        this.service_user_id = service_user_id;
    }

    public null getEstimated_delivery_date ()
    {
        return estimated_delivery_date;
    }

    public void setEstimated_delivery_date (null estimated_delivery_date)
    {
        this.estimated_delivery_date = estimated_delivery_date;
    }

    public String getLast_menstrual_period ()
    {
        return last_menstrual_period;
    }

    public void setLast_menstrual_period (String last_menstrual_period)
    {
        this.last_menstrual_period = last_menstrual_period;
    }

    public String[] getBirth_mode ()
    {
        return birth_mode;
    }

    public void setBirth_mode (String[] birth_mode)
    {
        this.birth_mode = birth_mode;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", baby_ids = "+baby_ids+", anti_d = "+anti_d+", gestation = "+gestation+", additional_info = "+additional_info+", perineum = "+perineum+", feeding = "+feeding+", created_at = "+created_at+", service_user_id = "+service_user_id+", estimated_delivery_date = "+estimated_delivery_date+", last_menstrual_period = "+last_menstrual_period+", birth_mode = "+birth_mode+"]";
    }
}
