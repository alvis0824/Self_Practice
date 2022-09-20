package day22_Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Insert {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(insert(arr,2,100)));
    }

    public static int[] insert(int[] arr, int index, int element) {
        int[] newArray = new int[arr.length+1];
        for (int i = 0; i < newArray.length; i++) {
            if(i < index){
                newArray[i] = arr[i];
            }else if(i == index){
                newArray[i] = element;
            }else{
                newArray[i] = arr[i-1];
            }
        }
        return newArray;
    }

    public static double[] insert(double[] arr, int index, double element) {
        double[] newArray = new double[arr.length+1];
        for (int i = 0; i < newArray.length; i++) {
            if(i < index){
                newArray[i] = arr[i];
            }else if(i == index){
                newArray[i] = element;
            }else{
                newArray[i] = arr[i-1];
            }
        }
        return newArray;
    }

    public static char[] insert(char[] arr, int index, char element) {
        char[] newArray = new char[arr.length+1];
        for (int i = 0; i < newArray.length; i++) {
            if(i < index){
                newArray[i] = arr[i];
            }else if(i == index){
                newArray[i] = element;
            }else{
                newArray[i] = arr[i-1];
            }
        }
        return newArray;
    }

    public static String[] insert(String[] arr, int index, String element) {
        String[] newArray = new String[arr.length+1];
        for (int i = 0; i < newArray.length; i++) {
            if(i < index){
                newArray[i] = arr[i];
            }else if(i == index){
                newArray[i] = element;
            }else{
                newArray[i] = arr[i-1];
            }
        }
        return newArray;
    }
}
