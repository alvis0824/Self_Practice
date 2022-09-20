package mentorSession0914;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {16,3,11,5,15};
        System.out.println(Arrays.toString(twoSumSolution(nums, 8)));
    }
    public static int[] twoSumSolution(int[] array, int targetValue){
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i <array.length; i++) {
            int potentialMatch = targetValue - array[i];
            if (map.containsValue(potentialMatch)) return new int[] {potentialMatch,array[i]};
            else map.put(i, array[i]);

        }
        return new int[]{};
    }
}
