package week22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Palindrome {

    public static void main(String[] args) {

        String str = "A brown fox jumping over";
        System.out.println(isPalindrome(str));
    }

    private static boolean isPalindrome(String str) {
        List<Character> chars = str.toLowerCase().chars()
                .mapToObj(i -> (char)i)
                .filter(Character::isLetter)
                .collect(Collectors.toList());

        for (int i = 0, j = chars.size()-1; i < chars.size(); i++,j--) {
            if(chars.get(i).equals(chars.get(j))) return true;
        }
        return false;
    }
}
