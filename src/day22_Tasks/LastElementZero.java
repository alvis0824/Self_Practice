package day22_Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class LastElementZero {

    public static void main(String[] args) {

        Integer[] array = {1,2,3,4,5};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        list.set(4,0);
        System.out.println(list);
    }
}

/*
write a program that can set the last element of the Integer arraylist to zero
            ex:
                list = [1,2,3,4,5];

            output:
            	[1,2,3,4,0];
 */