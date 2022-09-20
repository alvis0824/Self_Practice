package day28_Tasks;

public class Credentials {

    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(!isStrongPassWord(password)){
            System.err.println("Password is not strong password");
            System.exit(1);
        }
        this.password = password;
    }

    public Credentials(String userName, String password) {
        setUserName(userName);
        setPassword(password);
    }

    public boolean isStrongPassWord(String password){
        boolean result = true;
        if(password.length() < 8 || password.contains(" ")){
            result = false;
        }
        int countLetter = 0, countSpecial = 0, countDigit = 0;
        for (char each : password.toCharArray()) {
            if(Character.isLetter(each)){
                countLetter++;
            }
            if(!Character.isLetterOrDigit(each)){
                countSpecial++;
            }
            if(Character.isDigit(each)){
                countDigit++;
            }
        }
        if(countLetter == 0 || countSpecial == 0 || countDigit == 0){
            result = false;
        }

        return result;

    }

    public String toString() {
        return "Credentials{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
