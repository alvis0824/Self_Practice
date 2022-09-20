package day31_Tasks;

public class CydeoStudent extends Student{

    private int batchNumber;
    private int groupNumber;
    private String programmingLanguage;

    public CydeoStudent(String name, int age, char gender, String studentId, String fieldOfStudy, String schoolName, char grade, int batchNumber, int groupNumber, String programmingLanguage) {
        super(name, age, gender, studentId, fieldOfStudy, schoolName, grade);
        setBatchNumber(batchNumber);
        setGroupNumber(groupNumber);
        setProgrammingLanguage(programmingLanguage);
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if(batchNumber <= 0){
            System.err.println("Invalid batch number: " + batchNumber);
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        if(groupNumber <= 0){
            System.err.println("Invalid group number: " + groupNumber);
            System.exit(1);
        }
        this.groupNumber = groupNumber;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if(programmingLanguage == null || programmingLanguage.trim().isEmpty()){
            System.err.println("Invalid programming language: " + programmingLanguage);
            System.exit(1);
        }
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void drink() {
        super.drink();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                ", batchNumber=" + getBatchNumber() +
                ", groupNumber=" + getGroupNumber() +
                ", programmingLanguage=" + getProgrammingLanguage() +
                '}';
    }
}
