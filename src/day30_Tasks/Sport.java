package day30_Tasks;

public class Sport {

    private String name, rules;
    private int numberOfPlayers, numberOfReferee;

    public Sport(String name, String rules, int numberOfPlayers, int numberOfReferee) {
        setName(name);
        setRules(rules);
        setNumberOfPlayers(numberOfPlayers);
        setNumberOfReferee(numberOfReferee);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        if(numberOfPlayers <= 0){
            System.err.println("Invalid number of players: " + numberOfPlayers);
            System.exit(1);
        }
        this.numberOfPlayers = numberOfPlayers;
    }

    public int getNumberOfReferee() {
        return numberOfReferee;
    }

    public void setNumberOfReferee(int numberOfReferee) {
        if(numberOfReferee <= 0){
            System.err.println("Invalid number of referees: " + numberOfReferee);
            System.exit(1);
        }
        this.numberOfReferee = numberOfReferee;
    }

    public void play(){
        System.out.println(name + " is playing");
    }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", rules='" + rules + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferee=" + numberOfReferee +
                '}';
    }
}
