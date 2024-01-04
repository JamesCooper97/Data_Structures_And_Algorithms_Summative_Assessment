import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Dose {
    private static List<Dose> doses = new ArrayList<Dose>();
    private VaccineType vaccine;
    private Date date;
    private Patient patientObject;

    public Dose(VaccineType vaccineType, Date dateAdministered, Patient patient){
        vaccine = vaccineType;
        date = dateAdministered;
        patientObject = patient;
    }
}
