package day20_Tasks;

import utilities.StringUtility;

public class CountPalindromes {
    
    public static void main(String[] args) {
        
        String[] array = {"anna", "level", "Java"};

        int count = 0;
        for (String each : array) {
            if(StringUtility.reverse(each).equals(each)){
                count++;
            }
        }
        System.out.println(count);
    }
}

/*
write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
 */
