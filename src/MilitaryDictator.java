public class MilitaryDictator extends GenericLeader implements PowerActions {

    public MilitaryDictator(String name, String country, int yearsInPower, String militaryRank) {
        super(name, country, yearsInPower);
        this.militaryRank = militaryRank;
    }

    String politiskTale = "Great nation, great weapons, death to the infidels"; //Krav: metode, der returnerer en string.. billig løsning?

    @Override
    public void printDetails() {
        super.printDetails();

        System.out.println("Denne diktator har ranket: " + militaryRank);
    }

    @Override
    public void implementPolicy() {
        System.out.println("Implementerer udgangsforbud uden autoriseret tilladelse");
    }

    @Override
    public String giveSpeech() {
        System.out.println("Diktatorerens yndlings slagord: " + politiskTale);
    return politiskTale;}

    @Override
    public void repressOpposition() {
        System.out.println("Diktatoreren gør brug af militærpolitiet til at fængsle oppositionen");
    }

    @Override
    public void holdParade() {
        System.out.println("Big military parade, much wow");
    }

    public String getMilitaryRank() {
        return militaryRank;
    }

    public void setMilitaryRank(String militaryRank) {
        this.militaryRank = militaryRank;
    }


    private String militaryRank;

}






