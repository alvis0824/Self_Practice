package day19_Tasks;

import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {

        int[] array = {10, 0, 5, 0, 1, 0};
        int[] moveZero = new int[array.length];

        for (int i = 0, j = 0; i < array.length; i++, j++) {
            if(array[i] != 0){
                moveZero[j] = array[i];
            }else{
                j--;
            }
        }
        System.out.println("moveZero = " + Arrays.toString(moveZero));
    }
}

/*

write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}

 */