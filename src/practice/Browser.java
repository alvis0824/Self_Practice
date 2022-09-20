package practice;

public class Browser {

    public static void main(String[] args) {

        String browserName = "firefox";
        String b1 = "chrome", b2 = "firefox", b3 = "opera", b4 = "safari", b5 = "edge";
        String result = " Browser is selected";

        if(browserName == b1 || browserName == b2 || browserName == b3 || browserName == b4 || browserName == b5){
            if(browserName == b1) result = b1+ result;
            else if(browserName == b2) result = b2 + result;
            else if(browserName == b3) result = b3+ result;
            else if(browserName == b4) result = b4+ result;
            else result = b5+ result;
        }else result = "Invalid Browser Name";

        System.out.println(result);
    }
}
