package io.devstream.smartapp_team_five;

public class ServiceUsers
{
    private String id;

    private String[] baby_ids;

    private String hospital_number;

    private String[] pregnancy_ids;

    private ClinicalFields clinical_fields;

    private PersonalFields personal_fields;

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

    public ClinicalFields getClinical_fields ()
    {
        return clinical_fields;
    }

    public void setClinical_fields (ClinicalFields clinical_fields)
    {
        this.clinical_fields = clinical_fields;
    }

    public PersonalFields getPersonal_fields ()
    {
        return personal_fields;
    }

    public void setPersonal_fields (PersonalFields personal_fields)
    {
        this.personal_fields = personal_fields;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", baby_ids = "+baby_ids+", hospital_number = "+hospital_number+", pregnancy_ids = "+pregnancy_ids+", clinical_fields = "+clinical_fields+", personal_fields = "+personal_fields+"]";
    }
}
			
