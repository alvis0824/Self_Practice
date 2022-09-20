package day22_Tasks;

public class Warmup {

    public static void main(String[] args) {

        int[][] array = { {100, 20, 300}, {10, 1000, 50}, {-200, 400, 0} };
        int max = array[0][0];
        int min = max;

        for (int[] arr1D : array) {
            for (int each : arr1D) {
                if(each > max){
                    max = each;
                }
                if(each < min){
                    min = each;
                }
            }
        }
        System.out.println("Maximum number is: " + min);
        System.out.println("Minimum number is: " + max);
    }
}


/*
Write a program that can find the minimum and maximum numbers from a two dimensional array of integers
        Ex:
            array = { {100, 20, 300}, {10, 1000, 50}, {-200, 400, 0} };

            output:
                Minimum number is: -200
                Maximum number is: 1000
 */
