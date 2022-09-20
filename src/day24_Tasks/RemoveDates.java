package day24_Tasks;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDates {

    public static void main(String[] args) {

        ArrayList<LocalDate> dates = new ArrayList<>(Arrays.asList(LocalDate.of(2015,8,24), LocalDate.of(1993,2,9), LocalDate.of(2019,10,8), LocalDate.of(2020,8,24)));
        dates.removeIf(p -> p.isBefore(LocalDate.of(2016,8,15)));
        System.out.println(dates);
    }
}


/*
create an Arraylist of LocalDate, write a program that can remove all the dates before August-15-2016
 */