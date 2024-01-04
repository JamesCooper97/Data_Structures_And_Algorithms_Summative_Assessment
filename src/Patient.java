/*
 * 
 */

import java.util.ArrayList;
import java.util.LinkedList;

public class Patient {
    
    //Declare patient attributes
    private static long IDSeed = 1; //static variable that is defined as 1 on initial start. With each creation of a new patient the ID will count +1 upwards to ensure that ID's are not duplicated
    private long id;
    private String first_name, last_name;
    private int age;
    private ArrayList<Allergy> allergies = new ArrayList<>();
    private ArrayList<Dose> doses = new ArrayList<Dose>();

    public Patient(String patientFirstName, String patientLastName, int patientAge, Allergy allergy){
        id = IDSeed;
        IDSeed++;
        first_name = patientFirstName;
        last_name = patientLastName;
        age = patientAge;
        allergies.add(allergy);
    }

    public long getID(){
        return id;
    }

    //Function to return the name of the patient
    public String getFirstName(){
        return first_name;
    }

    //Function to return the name of the patient
    public String getLastName(){
        return last_name;
    }

    //Function to return the age of the patient
    public int getAge(){
        return age;
    }

    public void addAllergy(Allergy allergy){
        allergies.add(allergy);
    }

    //Function to return available vaccines for the patient
    public String checkAllergy(){
        for (Allergy allergy : allergies){

        }
        return "";
    }

}
