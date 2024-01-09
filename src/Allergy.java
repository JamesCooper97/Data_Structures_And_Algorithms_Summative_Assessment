import java.util.List;

public class Allergy{
    private static long idSeed = 1;
    private long id;
    private String name;
    private VaccineType recommendedVaccineType;

    //Function to construct an allergy
    public Allergy(String allergyName, VaccineType vaccineType){
        this.id = idSeed;
        this.idSeed++;
        this.name = allergyName;
        this.recommendedVaccineType = vaccineType;
    }

    public VaccineType getVaccineType(){
        return recommendedVaccineType;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return this.name;
    }

}


