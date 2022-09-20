package day31_Tasks;

public class Developer extends Employee{

    private String programmingLanguage;

    public Developer(String name, String jobTitle, String companyName, char gender, int age, int id, double salary, String programmingLanguage) {
        super(name, jobTitle, companyName, gender, age, id, salary);
        setProgrammingLanguage(programmingLanguage);
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is coding in " + programmingLanguage);
    }
}
