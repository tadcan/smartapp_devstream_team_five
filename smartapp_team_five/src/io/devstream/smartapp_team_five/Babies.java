package io.devstream.smartapp_team_five;

public class Babies
{
    private String id;

    private String hearing;

    private String pregnancy_id;

    private String weight;

    private String birth_outcome;

    private String name;

    private String hospital_number;

    private String delivery_date_time;

    private String gender;

    private String vitamin_k;

    private String newborn_screening_test;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getHearing ()
    {
        return hearing;
    }

    public void setHearing (String hearing)
    {
        this.hearing = hearing;
    }

    public String getPregnancy_id ()
    {
        return pregnancy_id;
    }

    public void setPregnancy_id (String pregnancy_id)
    {
        this.pregnancy_id = pregnancy_id;
    }

    public String getWeight ()
    {
        return weight;
    }

    public void setWeight (String weight)
    {
        this.weight = weight;
    }

    public String getBirth_outcome ()
    {
        return birth_outcome;
    }

    public void setBirth_outcome (String birth_outcome)
    {
        this.birth_outcome = birth_outcome;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getHospital_number ()
    {
        return hospital_number;
    }

    public void setHospital_number (String hospital_number)
    {
        this.hospital_number = hospital_number;
    }

    public String getDelivery_date_time ()
    {
        return delivery_date_time;
    }

    public void setDelivery_date_time (String delivery_date_time)
    {
        this.delivery_date_time = delivery_date_time;
    }

    public String getGender ()
    {
        return gender;
    }

    public void setGender (String gender)
    {
        this.gender = gender;
    }

    public String getVitamin_k ()
    {
        return vitamin_k;
    }

    public void setVitamin_k (String vitamin_k)
    {
        this.vitamin_k = vitamin_k;
    }

    public String getNewborn_screening_test ()
    {
        return newborn_screening_test;
    }

    public void setNewborn_screening_test (String newborn_screening_test)
    {
        this.newborn_screening_test = newborn_screening_test;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", hearing = "+hearing+", pregnancy_id = "+pregnancy_id+", weight = "+weight+", birth_outcome = "+birth_outcome+", name = "+name+", hospital_number = "+hospital_number+", delivery_date_time = "+delivery_date_time+", gender = "+gender+", vitamin_k = "+vitamin_k+", newborn_screening_test = "+newborn_screening_test+"]";
    }
}
