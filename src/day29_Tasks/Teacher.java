package day29_Tasks;

public class Teacher extends Employee {


    public Teacher(String name, char gender, int age, String id, String jobTitle, double salary) {
        super(name, gender, age, id, jobTitle, salary);
    }

    public void teaching(){
        System.out.println(getName() + " is teaching");
    }
}
