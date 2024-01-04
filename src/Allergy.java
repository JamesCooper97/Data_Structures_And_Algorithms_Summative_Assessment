import java.util.List;

public class Allergy{
    private List<String> Allergies = List.of(
        "Gelatin",
        "Polyethylene Glycol (PEG)",
        "Polysorbate 80 (PS80)"
    );

    private static long idSeed = 1;
    private long id;
    private String name;
    private VaccineType recommendedVaccineType;

    //Function to add allergies if they are more
    public Allergy(String allergyName, VaccineType vaccine){
        name = allergyName;
        recommendedVaccineType = vaccine;
        id = idSeed;
        idSeed++;
    }

}


