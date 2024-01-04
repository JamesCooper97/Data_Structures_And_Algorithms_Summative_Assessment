import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class TestClass {
    public static ArrayList<Dose> doses = new ArrayList<>();
    public void setupTestData(){
        //Create Allergies
        Allergy a1 = new Allergy("Polyethylene Glycol (PEG)", VaccineType.AstraZeneca);
        Allergy a2 = new Allergy("Polysorbate 80 (PS80)", VaccineType.AstraZeneca);
        Allergy a3 = new Allergy("Gelatin", VaccineType.Pfizer);


        Patient p1 = new Patient("Jack", "Stone", 98, a1);

        SimpleDateFormat DateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date1 = new Date("02/23/2023");
        Dose d1 = new Dose(VaccineType.AstraZeneca, date1, p1);
        doses.add(d1);

    }
}
