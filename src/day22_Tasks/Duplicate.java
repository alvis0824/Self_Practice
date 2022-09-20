package day22_Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Duplicate {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        arrayList.addAll(arrayList.size(),arrayList);

        System.out.println(arrayList);

    }

}

/*
Write a program that can duplicate the elements of an arraylist
		 	ex:
                list = [1,2,3,4,5];

            output:
            	[1,2,3,4,5,1,2,3,4,5];
 */
