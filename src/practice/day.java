package practice;

import java.util.Scanner;

public class day  {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter day number:");
        int dayNum = scan.nextInt();

        String day = "";
        switch (dayNum){
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;

            default:
                day = "Not a valid day";
        }

        System.out.println(day);

    }

}
