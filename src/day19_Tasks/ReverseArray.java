package day19_Tasks;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        
        int[] array = {1,2,3,4,5};
        int[] reversedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            reversedArray[array.length-1-i] = array[i];
        }
        System.out.println("reversedArray = " + Arrays.toString(reversedArray));
    }
}

/*

Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};

 */
