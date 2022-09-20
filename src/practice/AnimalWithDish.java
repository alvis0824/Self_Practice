package practice;

import java.util.Scanner;

public class AnimalWithDish {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Animal's name: ");
        String name = input.nextLine().toLowerCase();

        System.out.println("Dish name: ");
        String dish = input.nextLine().toLowerCase();

        System.out.println(ifAllowed(name, dish));

        input.close();
    }

    public static boolean ifAllowed(String name, String dish){

        return ((name.charAt(0) == dish.charAt(0)) && (name.charAt(name.length()-1) == dish.charAt(dish.length()-1)));

    }
}
