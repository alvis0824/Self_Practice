package day20_Tasks;

public class CountEvenOdd {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9,10,12,14,16};
        int countEven = 0, countOdd = 0;
        for (int each : numbers) {
            if(each % 2 == 0){
                countEven++;
            }else{
                countOdd++;
            }
        }
        System.out.println("Even Numbers = " + countEven);
        System.out.println("Odd Numbers = " + countOdd);
    }
}

/*
 Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
 */
