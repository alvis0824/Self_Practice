package day21_Tasks;

import java.util.Arrays;

public class Fruits {

    public static void main(String[] args) {

        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };

        for (String[] group : items) {
            for (String item : group) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }

        System.out.println("------------------------------------");


        for (String[] group : items) {
            for (int i = group.length - 1; i >= 0; i--) {
                System.out.print(group[i] + "\t");
            }
            System.out.println();
        }

        System.out.println("------------------------------------");

        for (int i = items.length - 1; i >= 0; i--) {
            for (String each : items[i]) {
                System.out.print(each + "\t");
            }
            System.out.println();
        }
    }
}
