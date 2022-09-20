package day20_Tasks;

import java.util.Arrays;

public class ReverseSecond {

    public static void main(String[] args) {

        String sentence = "I Love Java";
        String[] words = sentence.split(" ");
        String reverse = "";
        for (int i = words[1].length()-1; i >= 0 ; i--) {
            reverse += words[1].charAt(i);
        }
        words[1] = reverse;
        System.out.println(Arrays.toString(words));
    }
}

/*
Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java
 */