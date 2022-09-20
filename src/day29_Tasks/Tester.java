package day29_Tasks;

public class Tester extends Employee{

    public Tester(String name, char gender, int age, String id, String jobTitle, double salary) {
        super(name, gender, age, id, jobTitle, salary);
    }

    public void testing(){
        System.out.println(getName() + " is testing");
    }
}
