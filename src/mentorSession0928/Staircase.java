package mentorSession0928;

public class Staircase {
    public static void main(String[] args) {

        int stairs = 3;
        System.out.println(variationCounts(stairs));
    }

    private static int variationCounts(int stairs) {

        if(stairs == 1) return 1;
        else return variationCounts(stairs-1) + (stairs-1);
    }
}
