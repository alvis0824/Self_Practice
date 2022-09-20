package day31_Tasks;

public class Tester extends Employee{


    public Tester(String name, String jobTitle, String companyName, char gender, int age, int id, double salary) {
        super(name, jobTitle, companyName, gender, age, id, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is testing");
    }
}
