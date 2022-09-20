package day22_Tasks;

import java.util.Arrays;

public class Replace {

    public static void main(String[] args) {

        int[] array1 = {1,2,3,4,5};
        double[] array2 = {10, 10, 20, 30.5, 40, 30.5, 30.5, 30.5};
        String[] array = {"Ali", "Dilbar", "Ali"};
        System.out.println(Arrays.toString(replace(array1, 2, 30)));
        System.out.println(Arrays.toString(replaceAll(array,"Ali","Dilbar")));
    }

    public static int[] replace(int[] array, int index, int newElement){
        array[index] = newElement;
        return array;
    }

    public static double[] replace(double[] array, int index, double newElement){
        array[index] = newElement;
        return array;
    }

    public static char[] replace(char[] array, int index, char newElement){
        array[index] = newElement;
        return array;
    }

    public static String[] replace(String[] array, int index, String newElement){
        array[index] = newElement;
        return array;
    }

    public static int[] replaceAll(int[] array, int oldElement, int newElement){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == oldElement){
                array[i] = newElement;
            }
        }
        return array;
    }

    public static double[] replaceAll(double[] array, double oldElement, double newElement){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == oldElement){
                array[i] = newElement;
            }
        }
        return array;
    }

    public static char[] replaceAll(char[] array, char oldElement, char newElement){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == oldElement){
                array[i] = newElement;
            }
        }
        return array;
    }

    public static String[] replaceAll(String[] array, String oldElement, String newElement){
        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(oldElement)){
                array[i] = newElement;
            }
        }
        return array;
    }
}
