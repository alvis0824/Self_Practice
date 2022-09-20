package day19_Tasks;

public class Initials {
    public static void main(String[] args) {

        String[] names = {"Ahmet Tugrul", "Alexander Bessonov", "Boban Milosevic", "Ekaterina Sementeva",
        "Ertugrul Ustaoglu", "Esmira Mindrescu", "Umran Ozman", "Khashayar Shayesteh", "Madiyar Damen", "Max Wilson"};

        String initials = "";
        for (int i = 0; i < names.length; i++) {
            initials = names[i].substring(0,1) + names[i].substring(names[i].indexOf(" ")+1,names[i].indexOf(" ")+2);
            System.out.println(initials);
        }
    }
}


/*

create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines

 */
