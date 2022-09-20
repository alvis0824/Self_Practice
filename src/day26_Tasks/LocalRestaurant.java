package day26_Tasks;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class LocalRestaurant {

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("Ali", "North York", 5);
        Server server1 = new Server("Alvis", 5, 20, true, LocalDate.of(2020,8,24));
        Server server2 = new Server("Dilbar", 3, 35, false, LocalDate.of(2021,7,18));
        Server server3 = new Server("Vinas", 2, 15, true, LocalDate.of(2020,4,23));

        Chef chef1 = new Chef("Akbar", 16,50,true);
        Chef chef2 = new Chef("Maryam", 15,45,false);
        Chef chef3 = new Chef("Marhaba", 12,30,true);

        restaurant.Chefs.addAll(Arrays.asList(chef1, chef2,chef3));

        restaurant.Servers.addAll(Arrays.asList(server1, server2, server3));

        System.out.println(restaurant);
        System.out.println(restaurant.Servers);
        System.out.println(restaurant.Chefs);


    }
}
