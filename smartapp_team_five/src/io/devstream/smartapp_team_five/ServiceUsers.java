package io.devstream.smartapp_team_five;

public class ServiceUsers
{
    private String id;

    private String[] baby_ids;

    private String hospital_number;

    private String[] pregnancy_ids;

    private ClinicalFields clinicalFields;

    private PersonalFields personalFields;

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

    public String getHospital_number ()
    {
        return hospital_number;
    }

    public void setHospital_number (String hospital_number)
    {
        this.hospital_number = hospital_number;
    }

    public String[] getPregnancy_ids ()
    {
        return pregnancy_ids;
    }

    public void setPregnancy_ids (String[] pregnancy_ids)
    {
        this.pregnancy_ids = pregnancy_ids;
    }

    public ClinicalFields getClinicalFields ()
    {
        return clinicalFields;
    }

    public void setClinicalFields (ClinicalFields ClinicalFields)
    {
        this.clinicalFields = clinicalFields;
    }

    public PersonalFields getPersonal_fields ()
    {
        return personalFields;
    }

    public void setPersonalFields (PersonalFields personal_Fields)
    {
        this.personalFields = personalFields;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", baby_ids = "+baby_ids+", hospital_number = "+hospital_number+", pregnancy_ids = "+pregnancy_ids+", ClinicalFields = "+ clinicalFields+", personalFields = "+ personalFields+"]";
    }
}
			
