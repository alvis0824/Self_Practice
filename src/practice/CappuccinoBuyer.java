package practice;

public class CappuccinoBuyer {

    public static void main(String[] args) {

        String size = "tall";
        String size1 = "tall";
        String size2 = "grande";
        String size3 = "venti";
        String result = "";

        if(size == size1 || size == size2 || size == size3){

            if(size == size1){
                result = "tall:\nprice is $3.69\n90 calories";
            }else if(size == size2){
                result = "grande:\nprice is $3.99\n120 calories";
            }else{
                result = "venti:\nprice is $4.29\n150 calories";
            }
        }else{
            result = "Invalid Size";
        }

        System.out.println(result);

    }
}

/*
1. Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino

			Valid sizes are tall, grande, venti and thier price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output shoud be "Invalid Size"

			Note: MUST use nested if
 */