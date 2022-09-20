package day24_Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondMaxMin {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8));

        int firstMax = Collections.max(list);
        int firstMin = Collections.min(list);

        list.removeAll(Arrays.asList(firstMax));
        list.removeAll(Arrays.asList(firstMin));

        System.out.println("second maximum number is " + Collections.max(list));
        System.out.println("second minimum number is " + Collections.min(list));

    }
}

/*
Write a program that can display the second maximum and minimum numbers from an arraylist of integers
		ex:
			list = {1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8}

		output:
			second maximum number is 7
			second minimum number is 1

	Note: DO NOT use any loops
 */
