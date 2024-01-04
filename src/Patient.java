/*
 * 
 */

import javafx.beans.property.SimpleStringProperty;

import java.util.ArrayList;
import java.util.LinkedList;

public class Patient {
    
    //Declare patient attributes
    private static long IDSeed = 1; //static variable that is defined as 1 on initial start. With each creation of a new patient the ID will count +1 upwards to ensure that ID's are not duplicated
    private long id;
    private String firstName, lastName;
    private int age;
    //private ArrayList<Allergy> allergies = new ArrayList<>(); //List as patient could have multiple allergies
    private Allergy allergy;
    private VaccineType vaccineType;

    public Patient(String patientFirstName, String patientLastName, int patientAge, Allergy newAllergy){
        this.id = IDSeed;
        IDSeed++;
        this.firstName = patientFirstName;
        this.lastName = patientLastName;
        this.age = patientAge;
        //allergies.add(allergy);
        this.allergy = newAllergy;
    }

    public long getID(){
        return id;
    }

    //Function to return the name of the patient
    public String getFirstName(){
        return firstName;
    }

    //Function to return the name of the patient
    public String getLastName(){
        return lastName;
    }

    //Function to return the age of the patient
    public int getAge(){
        return age;
    }

//    public String getAllergy(){
//        return allergies.get(0).getName();
//    }

    public String getAllergy(){
        return allergy.getName();
    }
    //public void addAllergy(Allergy allergy){
        //allergies.add(allergy);
    //}

    //Function to return available vaccines for the patient

}
