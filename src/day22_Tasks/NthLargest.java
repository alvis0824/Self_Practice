package day22_Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargest {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,7,8,8));
        Collections.sort(list);

        int n = 5;
        int nthMax = list.get(list.size()-1);

            for (int i = list.size() - 2; i >= 0; i--) {
                if(list.get(i) == list.get(i+1)){
                    i--;
                }
                nthMax = list.get(i);
                n--;
                if(n == 1) {
                    break;
                }
            }

        System.out.println(nthMax);
    }
}

/*
write a program that can return the nth largest number from an arraylist
            ex:
	            arraylist = {1,2,3,4,5,6,7,7,8,8}
	            n = 5

            output:
                4
 */
