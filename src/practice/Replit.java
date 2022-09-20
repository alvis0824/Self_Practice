package practice;

import java.util.Scanner;

public class Replit {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Enter first number:");
        num1 = input.nextInt();
        System.out.println("Enter second number:");
        num2 = input.nextInt();
        System.out.println("Enter third number:");
        num3 = input.nextInt();

        int middle;
        if(num1 > num2){
            if(num2 > num3){
                middle = num2;
            }else{
                if(num3 > num1){
                    middle = num1;
                }else{
                    middle = num3;
                }
            }
        }else{
            if(num2 < num3){
                middle = num2;
            }else{
                if(num1 > num3){
                    middle = num1;
                }else{
                    middle = num3;
                }
            }
        }

        System.out.println("middle number is: " + middle);
    }
}
