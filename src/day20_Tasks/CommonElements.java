package day20_Tasks;

public class CommonElements {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,5,6,7,8};
        String result = "";

        for (int each1 : arr1) {
            for (int each2 : arr2) {
                if(each2 == each1){
                    result += each2 + " ";
                }
            }
        }
        System.out.println(result);
    }
}

/*
Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5


          MUST use for each loops
 */
