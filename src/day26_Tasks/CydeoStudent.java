package day26_Tasks;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender;
    public String id;
    public int batchNumber;
    public int groupNumber;
    public static String schoolName = "Cydeo School";
    public static String magicWord = "Java";

    public CydeoStudent(String name, int age, char gender, String id, int batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    public void study(){
        System.out.println(name + "is studying");
    }

    public void attendClass(){
        System.out.println(name + " attended the class");
    }

    public static void printSchoolName(){
        System.out.println("The school name is: " + schoolName);
    }

    public static void printProgLanguage(){
        System.out.println("The programming language is: " + magicWord);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
