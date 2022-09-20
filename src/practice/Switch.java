package practice;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        double total = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Select screen size:");
        String screenSize = input.next();
        switch (screenSize){
            case "13.3":
                total += 200;
                break;
            case "15.0":
                total += 300;
                break;
            case "17.3":
                total += 400;
                break;
        }

        System.out.println("Select CPU type:");
        String CPU = input.next();
        switch (CPU){
            case "i3":
                total += 150;
                break;
            case "i5":
                total += 250;
                break;
            case "i7":
                total += 350;
                break;
        }

        System.out.println("Select RAM size:");
        int RAM = input.nextInt();
        total += RAM / 4 * 50;

        System.out.println("Select storage type:");
        String storageType = input.next();
        System.out.println("Select storage size:");
        int storageSize = input.nextInt();
        switch (storageType){
            case "HDD":
                total += storageSize / 500 * 50;
                break;
            case "SSD":
                total += storageSize / 500 * 100;
                break;
        }

        System.out.println("Select screen resolution:");
        String resolution = input.next();
        switch (resolution){
            case "FULLHD":
                total += 100;
                break;
            case "4K":
                total += 200;
                break;
        }

        System.out.println("Final price is: $" + total);


    }
}
