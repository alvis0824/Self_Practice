package day24_Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class CountryNames {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Canada", "United States", "United Kingdom", "Australia", "Russia", "China", "Indonesia"));
        list.removeIf(p -> p.length() >= 10);
        System.out.println(list);
    }
}

/*
Create an ArrayList of string called country names, write a program that can remove all the country names that have length of 10 or greater
 */
