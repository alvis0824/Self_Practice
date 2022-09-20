package practice;

public class FINRA {

    public static void main(String[] args) {

        int number = 15;
        int result1 = number%3;
        int result2 = number%5;
        String result = "";

        if(result1 != 0 && result2 != 0){
            result = "Output:" + number ;
        }else{

            if(result1 == 0 && result2 != 0){
                result = "Output: FIN";
            }else if(result1 != 0 && result2 == 0){
                result = "Output: RA";
            }else{
                result = "Output: FINRA";
            }
        }

        System.out.println(result);

    }
}

/*

Create a class called FINRA, Write a function which prints out the number. but for number which is a multiple of 3, print "FIN" instead of the number and for number which is a multiple of 5, print "RA" instead of the number. and for number which is a multiple of both 3 and 5, print "FINRA" instead of the number.
            ex:
                number = 3

                output:
                      FIN


                number = 10

	            output:
	                RA


            	number = 15

	            output:
	                FINRA


 */
