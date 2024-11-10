public class PoliticalDictator extends GenericLeader implements PowerActions {

    public PoliticalDictator(String name, String country, int yearsInPower, String partyName) {
        super(name, country, yearsInPower);
        this.partyName = partyName;
    }

    String politiskTale = "Min modstander er ikke pålidelig"; //Krav: metode, der returnerer en string.. billig løsning?


    public String giveSpeech(){
        System.out.println("Diktatorerens yndlings slagord: " + politiskTale);
    return politiskTale;}


    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Denne diktator er medlem af partiet: " + partyName);
    }

    @Override
    public void repressOpposition() {
        System.out.println("Diktatoreren befaler en politisk forfølgelse af de andre kandidater");
    }

    @Override
    public void implementPolicy() {
        System.out.println("Diktatoreren fjerner grundlov om maksimal regeringstid");
    }

    @Override
    public void holdParade() {
        System.out.println("Bread and games");
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    private String partyName;

}