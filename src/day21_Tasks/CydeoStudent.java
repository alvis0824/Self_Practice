package day21_Tasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CydeoStudent {

    public static void main(String[] args) {

        String[] batch1Group1 = {"Ahmet", "Baturay", "Beyza", "Dilara", "Muhtar"};
        String[] batch1Group2 = {"Entisar", "Ermek", "Esmira", "Gadir", "Hrvoje", "Igor", "Muhtar"};
        String[] batch1Group3 = {"Kramer", "Lorraine", "Lucy", "Madina", "Yasin", "Muhtar"};

        String[][] batch1Groups = {batch1Group1, batch1Group2, batch1Group3};

        String[] batch2Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
        String[] batch2Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] batch2Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

        String[][] batch2Groups = {batch2Group1, batch2Group2, batch2Group3};

        String[][][] CydeoStudents = {batch1Groups,batch2Groups};

        for (String[][] batchGroups : CydeoStudents) {
            for (String[] groups : batchGroups) {
                System.out.println(Arrays.toString(groups));
                for (String student : groups) {
                    System.out.println(student);
                }
            }
        }

    }
}


