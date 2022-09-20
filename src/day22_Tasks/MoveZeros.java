package day22_Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));
        ArrayList<Integer> newList = new ArrayList<>(Arrays.asList());

        for (Integer each : list) {
            if(each != 0){
                newList.add(each);
            }
        }
        int numOfZero = list.size() - newList.size();
        for (int i = 0; i < numOfZero; i++) {
            newList.add(0);
        }

        System.out.println(newList);

    }
}


/*
Write a program that can move all the zeros to the last indexes of ArrayList
            ex:
                list: {1,0,2,0,3,0,4,0}

            output:
                [1, 2, 3, 4, 0, 0, 0, 0]
 */