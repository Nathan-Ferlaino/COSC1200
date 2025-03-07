public class VaccineDriver {

    public VaccineDriver(){
        Vaccine moderna = new Vaccine();
        moderna.displayVaccine(false);

        moderna.setId(111111);
        moderna.setName("Moderna");
        moderna.setCost(21.2);
        moderna.setAvailableUnits(1200);
        moderna.setExpiryDate("April 30th");
        moderna.setInstructions("don't drink it");

        moderna.displayVaccine(false);

        Vaccine novaVax = new Vaccine(121212, "NovaVax",25.7, 900,"March 20th","idk maybe drink it?");

        Vaccine pfizer = new Vaccine(101010, "Pfizer", 30.5,1000, "March 1st", "insert needle" );

        Vaccine[] vaccineList = {moderna,pfizer,novaVax};

        for(int i = 0; i < vaccineList.length; i++){
            vaccineList[i].displayVaccine(true);
        }
        pfizer.displayVaccine(false);
    }

    public static void main(String[] args) {
        new VaccineDriver();
    }
}