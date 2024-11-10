abstract class GenericLeader {

    String name; //Attributter til vores konstruktør
    String country;
    int yearsInPower;

    public GenericLeader(String name, String country, int yearsInPower) { //Konstruktør af genericLeader
        this.yearsInPower = yearsInPower;
        this.country = country;
        this.name = name;

    }

    abstract String giveSpeech(); //Abstrakt metode. Ingen krop(logik) i metoden

    public void printDetails () { //Konkret metode

        System.out.println("Denne diktator hedder: " + this.name);

        System.out.println("Denne diktator regerer over: " + this.country);

        System.out.println("Denne diktator har været ved magten i: " + this.yearsInPower);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYearsInPower() {
        return yearsInPower;
    }

    public void setYearsInPower(int yearsInPower) {
        this.yearsInPower = yearsInPower;
    }
}





