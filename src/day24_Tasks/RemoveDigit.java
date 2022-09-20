package day24_Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDigit {
    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>(Arrays.asList('$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));
        list.removeIf(p -> Character.isDigit(p));
        System.out.println(list);
    }
}
