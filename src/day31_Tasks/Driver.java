package day31_Tasks;

public class Driver extends Employee{


    public Driver(String name, String jobTitle, String companyName, char gender, int age, int id, double salary) {
        super(name, jobTitle, companyName, gender, age, id, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is driving");
    }
}
