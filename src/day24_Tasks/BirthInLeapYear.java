package day24_Tasks;

import java.time.LocalDate;

public class BirthInLeapYear {

    public static void main(String[] args) {

        LocalDate birthday = LocalDate.of(1992,7,18);
        boolean birthYear = isLeapYear(birthday.getYear());
        System.out.println(birthYear);
    }

    public static boolean isLeapYear(int birthYear){
        LocalDate birthday = LocalDate.of(birthYear, 1,1);
        if(birthday.isLeapYear()){
            return true;
        }else{
            return false;
        }
    }
}

/*
Create a function that accepts an int argument birthYear, return true if the person was born on leap year, otherwise return false
 */
