package day29_Tasks;

public class Developer extends Employee {

    private String programmingLanguage;

    public Developer(String name, char gender, int age, String id, String jobTitle, double salary, String programmingLanguage) {
        super(name, gender, age, id, jobTitle, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        boolean isValid = programmingLanguage.equals("Java") || programmingLanguage.equals("JavaScript") ||
                programmingLanguage.equals("Python") || programmingLanguage.equals("Ruby") ||
                programmingLanguage.equals("C#") || programmingLanguage.equals("C++") || programmingLanguage.equals("Swift");
        if(isValid){
            this.programmingLanguage = programmingLanguage;
        }else{
            System.err.println("Invalid programming language: " + programmingLanguage);
            System.exit(1);
        }
    }

    public void coding(){
        System.out.println(getName() + " is coding");
    }

    public String toString() {
        return "Developer{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", id='" + getId() + '\'' +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", salary=" + getSalary() +
                ", programming language=" + programmingLanguage +
                '}';
    }

}
