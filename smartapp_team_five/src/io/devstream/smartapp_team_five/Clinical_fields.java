package io.devstream.smartapp_team_five;

public class Clinical_fields
{
    private String parity;

    private String blood_group;

    private String bmi;

    private String rhesus;

    private String previous_obstetric_history;

    public String getParity ()
    {
        return parity;
    }

    public void setParity (String parity)
    {
        this.parity = parity;
    }

    public String getBlood_group ()
    {
        return blood_group;
    }

    public void setBlood_group (String blood_group)
    {
        this.blood_group = blood_group;
    }

    public String getBmi ()
    {
        return bmi;
    }

    public void setBmi (String bmi)
    {
        this.bmi = bmi;
    }

    public String getRhesus ()
    {
        return rhesus;
    }

    public void setRhesus (String rhesus)
    {
        this.rhesus = rhesus;
    }

    public String getPrevious_obstetric_history ()
    {
        return previous_obstetric_history;
    }

    public void setPrevious_obstetric_history (String previous_obstetric_history)
    {
        this.previous_obstetric_history = previous_obstetric_history;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [parity = "+parity+", blood_group = "+blood_group+", bmi = "+bmi+", rhesus = "+rhesus+", previous_obstetric_history = "+previous_obstetric_history+"]";
    }
}