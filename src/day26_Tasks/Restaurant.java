package day26_Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public String Owner;
    public String Location;
    public int numbersOfStars;
    public ArrayList<Server> Servers = new ArrayList<>();
    public ArrayList<Chef> Chefs = new ArrayList<>();

    public Restaurant(String owner, String location, int numbersOfStars) {
        Owner = owner;
        Location = location;
        this.numbersOfStars = numbersOfStars;
    }

    public void hireServer(Server server){
        Servers.add(server);
    }

    public void hireServer(Server [] servers){
        Servers.addAll(Arrays.asList(servers));
    }

    public void hireChef(Chef chef){
        Chefs.add(chef);
    }

    public void hireChef(Chef [] chefs){
        Chefs.addAll(Arrays.asList(chefs));
    }

    public void terminateChef(int employeeID){
        Chefs.removeIf(p -> p.employeeID == employeeID);
    }

    public void terminateServer(int employeeID){
        Servers.removeIf(p -> p.employeeID == employeeID);
    }

    public String toString() {
        return "Restaurant{" +
                "Owner='" + Owner + '\'' +
                ", Location='" + Location + '\'' +
                ", numbersOfStars=" + numbersOfStars +
                ", numbersOfServers=" + Servers.size() +
                ", numbersOfChefs=" + Chefs.size() +
                '}';
    }
}
