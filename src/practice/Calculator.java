package practice;

public class Calculator {
    public static void main(String[] args) {

        int a = 3;
        int b = 1;
        int c = 2;

        if (a > b) {

            if (b > c) {

                System.out.println(b + " is the median number");

            } else if (a < c) {

                System.out.println(a + " is the median number");
            } else {

                System.out.println(c + " is the median number");
            }
        }

        if (a < b) {

            if (a > c) {

                System.out.println(a + " is the median number");
            } else if (c > b) {

                System.out.println(b + " is the median number");
            } else {

                System.out.println(c + " is the median number");
            }
        }
    }

}
