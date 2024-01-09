import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Vaccine {

    public static ObservableList<Vaccine> vaccines = FXCollections.observableArrayList();
    private static int idSeed = 1;
    private int id;
    private VaccineType vaccine;
    private int doseCount;
    public Vaccine(VaccineType vaccineType, int count){
        this.id = idSeed;
        this.vaccine = vaccineType;
        this.doseCount = count;
        idSeed++;
    }

    public int getID(){
        return this.id;
    }

    public int getDoseCount(){
        return this.doseCount;
    }

    public VaccineType getVaccineType(){
        return this.vaccine;
    }

    public void addDose(){
        doseCount++;
    }

    public void setDose(int i){
        doseCount=i;
    }

}
