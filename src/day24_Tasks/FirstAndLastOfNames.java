package day24_Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstAndLastOfNames {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));
        list.removeIf(p -> p.toLowerCase().substring(0,1).equals(p.toLowerCase().substring(p.length()-1)));
        System.out.println(list);
    }
}


/*
Write a program that can remove string elements from an arraylist if the firt and last characters of the string are same
	ex:
		list = {"Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"}

	output:
		["Lan", "Ebrahim", "Farida"]
 */