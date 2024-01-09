import javafx.beans.InvalidationListener;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.scene.control.TextField;

import java.time.LocalDate;
import java.util.*;

public class VaccineManager {

    public static void submitNewPatient(TextField firstNameField, TextField lastNameField, TextField ageField, Allergy allergy) {
        String fN = firstNameField.getText();
        Patient patient = new Patient(firstNameField.getText(), lastNameField.getText(), Integer.parseInt(ageField.getText()), allergy);
        Patients.patients.add(patient);
        System.out.println(Patients.patients.size());
    }

    public static void submitNewDose(LocalDate doseDate, Patient selectedPatient){
        Dose dose = new Dose(doseDate,selectedPatient);
        Doses.doses.add(dose);
    }

    public long getPatientIDByDetails(String firstName, String lastName, int age){
        for (Patient patient:Patients.patients){
            if (patient.getFirstName().equals(firstName) && patient.getLastName().equals(lastName) && patient.getAge()==age){
                return patient.getID();
            }
        }
        return 0;
    }

    public static void setVaccineCount(){
        for(Vaccine vaccine:Vaccine.vaccines){
            vaccine.setDose(0);
            for(Dose dose : Doses.doses){
                if (vaccine.getVaccineType().equals(dose.getVaccine())){
                    vaccine.addDose();
                }
            }
        }
    }

    public long getPatientIDByName(String firstName, String lastName){
        return (long)0;
    }

    public long getPatientIDsByFirstName(String firstName){
        return 0;
    }

    public long getPatientIDsByLastName(String lastName){
        return 0;
    }

    public ObservableList<Patient> getPatients(){
        return Patients.patients;
    }
}
