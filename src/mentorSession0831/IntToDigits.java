package mentorSession0831;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class IntToDigits {

    public static void main(String[] args) {
        Integer number = 490;
        System.out.println(Arrays.toString(toDigits(number)));
    }

    public static int[] toDigits(Integer integer){
        String num = Integer.toString(integer);
        IntStream stream = num.chars();
        stream.mapToObj(i -> (char)i)
                .forEach(System.out::println);
        return null;
    }


}
