package day31_Tasks;

public class States {

    private String name, abbreviation, politicalParty, Governor, senator;
    private long population;
    private double stateTax;

    public States(String name, String abbreviation, String politicalParty, String governor, String senator, long population, double stateTax) {
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
        setStateTax(stateTax);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.trim().isEmpty()){
            System.err.println("Invalid");
            System.exit(1);
        }
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if(abbreviation == null || abbreviation.trim().isEmpty()){
            System.err.println("Invalid");
            System.exit(1);
        }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if(politicalParty == null || politicalParty.trim().isEmpty()){
            System.err.println("Invalid");
            System.exit(1);
        }
        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return Governor;
    }

    public void setGovernor(String governor) {
        if(governor == null || governor.trim().isEmpty()){
            System.err.println("Invalid");
            System.exit(1);
        }
        Governor = governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if(senator == null || senator.trim().isEmpty()){
            System.err.println("Invalid");
            System.exit(1);
        }
        this.senator = senator;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        if(population <= 0){
            System.err.println("Population cannot be negative or zero");
            System.exit(1);
        }
        this.population = population;
    }

    public double getStateTax() {
        return stateTax;
    }

    public void setStateTax(double stateTax) {
        if(stateTax < 0){
            System.err.println("Tax rate cannot be negative");
            System.exit(1);
        }
        this.stateTax = stateTax;
    }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", Governor='" + Governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                ", stateTax=" + stateTax +
                '}';
    }
}
