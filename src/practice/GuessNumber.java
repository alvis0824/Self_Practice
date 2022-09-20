package practice;

import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int guess = 0;
        int realNumber = 25;
        
        while(guess != realNumber){
            System.out.println("Enter a number");
            guess = input.nextInt();
            
            if(guess > realNumber){
                System.out.println("Your guess is high");
            }else if(guess < realNumber){
                System.out.println("Your guess is low");
            }
            
        }

        System.out.println("You're correct");
    }
}
