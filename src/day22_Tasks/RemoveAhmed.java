package day22_Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAhmed {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"));

        for (int i = 0; i < names.size(); i++) {
            if(names.get(i).equals("Ahmed")){
                names.remove(i);
            }
        }

        System.out.println(names);
    }
}


/*
Write a program that can remove all the names "Ahmed" from an arraylist of String
			ex:
                list = ["John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"];

            output:
            	["John", "Daniel", "James", "Muhammed"];
 */