package day31_Tasks;

public class Student extends Person{

    private String studentId, fieldOfStudy, schoolName;
    private char grade;

    public Student(String name, int age, char gender, String studentId, String fieldOfStudy, String schoolName, char grade) {
        super(name, age, gender);
        setStudentId(studentId);
        setFieldOfStudy(fieldOfStudy);
        setSchoolName(schoolName);
        setGrade(grade);
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if(fieldOfStudy == null || fieldOfStudy.isEmpty()){
            System.err.println("Invalid field of study " + fieldOfStudy);
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        if(schoolName == null || schoolName.isEmpty()){
            System.err.println("Invalid school name " + schoolName);
            System.exit(1);
        }
        this.schoolName = schoolName;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if(!(grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F')){
            System.err.println("Invalid grade " + grade);
            System.exit(1);
        }
        this.grade = grade;
    }

    public void study(){
        System.out.println(getName() + " is studying");
    }

    @Override
    public String toString() {
        return super.toString().replace("}","") +
                ", student ID=" + getStudentId() +
                ", field of study=" + getFieldOfStudy() +
                ", grade=" + getGrade() +
                ", school name=" + getSchoolName() +
                '}';
    }
}
