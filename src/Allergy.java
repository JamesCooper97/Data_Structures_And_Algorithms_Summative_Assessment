import java.util.List;

public class Allergy{
    private static List<String> Allergies = List.of(
        "Gelatin",
        "Polyethylene Glycol (PEG)",
        "Polysorbate 80 (PS80)"
    );

    private static long idSeed = 1;
    private long id;
    private String name;
    private VaccineType recommendedVaccineType;
    private int count;

    //Function to construct an allergy
    public Allergy(String allergyName, VaccineType vaccineType){
        id = idSeed;
        idSeed++;
        name = allergyName;
        recommendedVaccineType = VaccineType.AstraZeneca;
        count=0;
    }

    public VaccineType getVaccineType(){
        return recommendedVaccineType;
    }

    public String getName(){
        return name;
    }

    public void addCount(){
        count++;
    }

    public void setCount(int i){
        count=i;
    }

}


