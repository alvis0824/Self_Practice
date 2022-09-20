package day25_Tasks;

public class Pizza {

    public char size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public int calcCost(){

        int totalCost;

        if(size == 'S'){
            totalCost = 10 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
        }else if(size == 'M'){
            totalCost = 12 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
        }else{
            totalCost = 14 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
        }

        return totalCost;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", cost=" + calcCost() +
                '}';
    }

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza('S', 2,4);

        System.out.println(pizza1);
    }
}
