package day31_Tasks;

public class StudentObjects {

    public static void main(String[] args) {

        CydeoStudent cydeoStudent = new CydeoStudent("Dilbar", 29, 'F', "A29", "Java Developer", "Cydeo", 'A', 1, 7, "Java");

        System.out.println(cydeoStudent);
        cydeoStudent.drink();
        cydeoStudent.eat();
        cydeoStudent.sleep();
        cydeoStudent.study();


    }

}
