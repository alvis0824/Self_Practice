package practice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RomanToInteger {

    public static void main(String[] args) {

        String str= "LVIII";
        System.out.println(romanToInt(str));
    }

    private static int romanToInt(String s) {
        Map<Character,Integer> romanInt = new HashMap<>();
        romanInt.put('I',1);
        romanInt.put('V',5);
        romanInt.put('X',10);
        romanInt.put('L',50);
        romanInt.put('C',100);
        romanInt.put('D',500);
        romanInt.put('M',1000);

        List<Integer> numList =s.chars().mapToObj(i -> (char)i)
                .map(i -> romanInt.get(i))
                .collect(Collectors.toList());

        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i) == 'I' && (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X')){
                numList.set(i, -1);
            }else if(s.charAt(i) == 'X' && (s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C')){
                numList.set(i, -10);
            } else if (s.charAt(i) == 'C' && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M')) {
                numList.set(i, -100);
            }
        }

        Integer sum = numList.stream().reduce(0,Integer::sum);

        return sum;
    }
}
