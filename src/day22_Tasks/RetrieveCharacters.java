package day22_Tasks;

public class RetrieveCharacters {

    public static void main(String[] args) {

        String str = "Wooden Spoon!";
        String letters = "", digits = "", specialChars = "";

        for (char each : str.toCharArray()) {
            if(Character.isLetter(each)){
                letters += each;
            }else if(Character.isDigit(each)){
                digits += each;
            }else{
                specialChars += each;
            }
        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);
    }
}
