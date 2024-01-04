import java.util.Date;

public class Dose {
    private VaccineType vaccine;
    private Date date;
    //private Patient patientObject;
    private String patientFirstName;

    private String patientLastName;

    private String patientAllergy;
    private int patientAge;

    private long patientID;

    public Dose(VaccineType vaccineType, Date dateAdministered, Patient patient){
        this.vaccine = vaccineType;
        this.date = dateAdministered;
        //this.patientObject = patient;
        this.patientID = patient.getID();
        this.patientFirstName = patient.getFirstName();
        this.patientLastName = patient.getLastName();
        this.patientAge = patient.getAge();
        this.patientAllergy = patient.getAllergy();
    }

    public long getPatientID(){
        return patientID;
    };

    public String getPatientFirstName(){
        return patientFirstName;
    }

    public String getPatientLastName(){
        return patientLastName;
    }

    public int getPatientAge(){
        return patientAge;
    }

    public String getPatientAllergy(){
        return patientAllergy;
    }

    public String getVaccine(){
        return vaccine.toString();
    }
    public Date getDate(){
        return date;
    }

}
