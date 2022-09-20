package day19_Tasks;

public class ReverseNames {
    public static void main(String[] args) {
        String[] names = {"Ahmet Tugrul", "Alexander Bessonov", "Boban Milosevic", "Ekaterina Sementeva",
                "Ertugrul Ustaoglu", "Esmira Mindrescu", "Umran Ozman", "Khashayar Shayesteh", "Madiyar Damen", "Max Wilson"};

        String eachName, reverse = "";

        for (int i = 0; i < names.length; i++) {
            eachName = names[i];
            for (int j = eachName.length()-1; j >=0 ; j--) {
                reverse += "" + names[i].charAt(j);
                if(j == 0){
                    System.out.println(reverse);
                    reverse = "";
                }
            }
        }
    }
}


/*
create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */