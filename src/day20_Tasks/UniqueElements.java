package day20_Tasks;

public class UniqueElements {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,4,6};
        String result = "";

        for (int each : array) {
            int count = 0;
            for (int i : array) {
                if(i == each){
                    count++;
                    continue;
                }
            }
            if(count == 1){
                result += each + " ";
            }
        }
        System.out.println(result);
    }
}

/*
Write a program that can display the unique elements of an array

			MUST use for each loops
 */