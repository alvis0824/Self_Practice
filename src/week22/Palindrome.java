package week22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Palindrome {

    public static void main(String[] args) {

        String str1 = "Do geese see God?";
        String str2 = "Was it a car or a cat I saw?";
        String str3 = "A brown fox jumping over";
        System.out.println(isPalindrome(str3));
    }

    private static boolean isPalindrome(String str) {
        List<Character> chars = str.toLowerCase().chars()
                .mapToObj(i -> (char) i)
                .filter(Character::isLetterOrDigit)
                .collect(Collectors.toList());

        for (int i = 0, j = chars.size() - 1; i < chars.size(); i++, j--) {
            if (!chars.get(i).equals(chars.get(j))) {
                return false;
            }
        }
        return true;

//        int start = 0;
//        int end = chars.size()-1;
//
//        while (start < end){
//            if(!chars.get(start).equals(chars.get(end))){
//                return false;
//            }
//            start++; end--;
//        }
//        return true;

    }
}
