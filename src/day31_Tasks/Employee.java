package day31_Tasks;

public class Employee {

    private String name, jobTitle, companyName;
    private char gender;
    private int age, id;
    private double salary;

    public Employee(String name, String jobTitle, String companyName, char gender, int age, int id, double salary) {
        setName(name);
        setJobTitle(jobTitle);
        setCompanyName(companyName);
        setGender(gender);
        setAge(age);
        setId(id);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(!(gender == 'M' || gender == 'F')){
            System.err.println("Invalid gender: " + gender);
            System.exit(1);
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <= 0){
            System.err.println("Invalid age: " + age);
            System.exit(1);
        }
        if(age < 18){
            System.err.println("Age cannot less than 18");
            System.exit(1);
        }
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary < 0){
            System.err.println("Salary cannot be negative");
            System.exit(1);
        }
        this.salary = salary;
    }

    public void work(){
        System.out.println(name + " is working");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
