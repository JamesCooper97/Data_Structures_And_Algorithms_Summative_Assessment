import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class TestClass {
    public void setupTestData(){
        //Create Allergies
        Allergy a1 = new Allergy("Polyethylene Glycol (PEG)", VaccineType.AstraZeneca);
        Allergy a2 = new Allergy("Polysorbate 80 (PS80)", VaccineType.AstraZeneca);
        Allergy a3 = new Allergy("Gelatin", VaccineType.Pfizer);
        Allergies.allergies.add(a1);
        Allergies.allergies.add(a2);
        Allergies.allergies.add(a3);

        Vaccine v1 = new Vaccine(VaccineType.AstraZeneca,0);
        Vaccine v2 = new Vaccine(VaccineType.Pfizer,0);
        Vaccine.vaccines.add(v1);
        Vaccine.vaccines.add(v2);

        Patient p1 = new Patient("Jack", "Stone", 98, a1);
        Patient p2 = new Patient("Geoff", "Skinner", 23,a2);
        Patient p3 = new Patient("Siera", "Lyon", 45, a3);
        Patient p4 = new Patient("Sally", "Crowes", 18, a2);
        Patients.patients.addAll(p1,p2,p3,p4);

        LocalDate date1 = LocalDate.of(2023,2,23);
        Dose d1 = new Dose(date1, p1);
        LocalDate date2 = LocalDate.of(2021,4,2);
        Dose d2 = new Dose(date2, p2);
        LocalDate date3 = LocalDate.of(2022,4,7);
        Dose d3 = new Dose(date3, p3);
        LocalDate date4 = LocalDate.of(2021,8,18);
        Dose d4 = new Dose(date4, p4);
        LocalDate date5 = LocalDate.of(2020,12,30);
        Dose d5 = new Dose(date5, p1);
        LocalDate date6 = LocalDate.of(2021,2,14);
        Dose d6 = new Dose(date6, p1);

        Doses.doses.add(d1);
        Doses.doses.add(d2);
        Doses.doses.add(d3);
        Doses.doses.add(d4);
        Doses.doses.add(d5);
        Doses.doses.add(d6);


    }
}
