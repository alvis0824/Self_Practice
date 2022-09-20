package day22_Tasks;

import java.util.ArrayList;

public class MaxMin {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] list = {1,2,3,4,5};
        for (int each : list) {
            arrayList.add(each);
        }
        int max = arrayList.get(0);
        int min = arrayList.get(0);

        for (Integer each : arrayList) {
            if(each > max){
                max = each;
            }
            if(each < min){
                min = each;
            }
        }

        System.out.println("Maximum number is " + max);
        System.out.println("Minimum number is " + min);
    }
}
