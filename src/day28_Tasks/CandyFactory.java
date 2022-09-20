package day28_Tasks;

import java.util.ArrayList;

public class CandyFactory {

    public static void main(String[] args) {

        ArrayList<Candy> list = new ArrayList<>();
        list.add(new Candy("M&M", 5,2.5,true));
        list.add(new Candy("Milky", 2,3.6,true));
        list.add(new Candy("Meltessers", 4,6,false));
        list.add(new Candy("KitKat", 3,3,true));
        list.add(new Candy("Meiji", 7,5,false));

        for (Candy each : list) {
            System.out.println(each.getBrand() + ", " + each.getPrice());
        }
    }
}
