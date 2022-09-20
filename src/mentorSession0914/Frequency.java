package mentorSession0914;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Frequency {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,3,2,1,3,2,2,2,4,2,2,2,2,2,2};
        printFrequency(array);
    }

    public static void printFrequency(int[] array){
        /*List<Integer> frequency = new ArrayList<>();
        List<Integer> list = new ArrayList<>(Arrays.asList(array));
        for (Integer each : list) {
            if(!frequency.contains(each)){
                frequency.add(each);
                int count = Collections.frequency(list,each);
                System.out.println(each + " is " + wordOfNumber(count) + " times");
            }
        }*/

        Map<Integer,Long> map = Arrays.stream(array)
                .mapToObj(i -> i)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        ArrayList<String> list = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "more than ten"));
        for (Map.Entry<Integer, Long> each : map.entrySet()) {
            System.out.println(each.getKey() + " is " + list.get(each.getValue().intValue()-1) + " times");
        }
    }

    private static String wordOfNumber(int frequency) {
        String word = "";
        switch (frequency){
            case 1 :
                word = "one";
                break;
            case 2 :
                word = "two";
                break;
            case 3 :
                word = "three";
                break;
            case 4 :
                word = "four";
                break;
            case 5 :
                word = "five";
                break;
            case 6 :
                word = "six";
                break;
            case 7 :
                word = "seven";
                break;
            case 8 :
                word = "eight";
                break;
            case 9 :
                word = "nine";
                break;
            case 10 :
                word = "ten";
                break;
            default:
                word = "more than ten";
        }
        return word;
    }
}
