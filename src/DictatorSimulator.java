public class DictatorSimulator {
    public static void main(String[] args) {


GenericLeader milLeader = new MilitaryDictator("Kim", "Korea", 15, "Über Commander"); //Kalder en instans af objektet MilitaryDictator
GenericLeader polLeader = new PoliticalDictator("Dennis", "South Sudan", 18, "Peoples democratic party"); //Kalder en instans (...) PoliticalLeader




        polLeader.printDetails();
        ((PoliticalDictator) polLeader).repressOpposition(); // Casting nødvendig fordi metoden ikke findes i klassen GenericLeader, kun pol/mil
        ((PoliticalDictator) polLeader).implementPolicy(); //Forstår ikke, hvorfor downcast nødvendig her, men ikke i metoden giveSpeech.
        polLeader.giveSpeech();
        ((PoliticalDictator) polLeader).holdParade();
        milLeader.printDetails(); //Cast behøves ikke, da printDetails findes universelt i alle klasserne.
        ((MilitaryDictator) milLeader).repressOpposition();
        ((MilitaryDictator) milLeader).implementPolicy();
        milLeader.giveSpeech();
        ((MilitaryDictator) milLeader).holdParade();


    }
}