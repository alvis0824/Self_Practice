package day22_Tasks;

public class UpperLowerCase {

    public static void main(String[] args) {

        int countUpper = 0, countLower = 0;
        String str = "JAVA java";
        for (char each : str.toCharArray()) {
            if(Character.isLetter(each)){
                if(Character.isUpperCase(each)){
                    countUpper++;
                }else{
                    countLower++;
                }
            }
        }
        System.out.println(countUpper == countLower);
    }
}
