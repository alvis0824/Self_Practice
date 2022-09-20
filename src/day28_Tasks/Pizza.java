package day28_Tasks;

public class Pizza {

    private String size;
    private int numberOfCheeseTopping;
    private int numberOfPepperoniTopping;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if(!(size.toLowerCase().equals("small") || size.toLowerCase().equals("medium") || size.toLowerCase().equals("large"))){
            System.err.println("Invalid size");
            System.exit(1);
        }
        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if(numberOfCheeseTopping < 0){
            System.err.println("Number Of Cheese Topping Cannot Be Negative");
            System.exit(1);
        }

        if(size.equalsIgnoreCase("small") && numberOfCheeseTopping > 3){
            System.err.println("Maximum number of cheese topping is 3 for small size");
            System.exit(1);
        }

        if(size.equalsIgnoreCase("medium") && numberOfCheeseTopping > 4){
            System.err.println("Maximum number of cheese topping is 4 for medium size");
            System.exit(1);
        }

        if(size.equalsIgnoreCase("large") && numberOfCheeseTopping > 5){
            System.err.println("Maximum number of cheese topping is 5 for large size");
            System.exit(1);
        }
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        if(numberOfPepperoniTopping < 0){
            System.err.println("Number Of Pepperoni Topping Cannot Be Negative");
            System.exit(1);
        }

        if(size.equalsIgnoreCase("small") && numberOfPepperoniTopping > 4){
            System.err.println("Maximum number of Pepperoni topping is 4 for small size");
            System.exit(1);
        }

        if(size.equalsIgnoreCase("medium") && numberOfPepperoniTopping > 5){
            System.err.println("Maximum number of Pepperoni topping is 5 for medium size");
            System.exit(1);
        }

        if(size.equalsIgnoreCase("large") && numberOfPepperoniTopping > 6){
            System.err.println("Maximum number of Pepperoni topping is 6 for large size");
            System.exit(1);
        }
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public int calcCost(){
        int cost = 0;
        if(size.equalsIgnoreCase("small")){
            cost = 10 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
        }
        if(size.equalsIgnoreCase("medium")){
            cost = 12 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
        }
        if(size.equalsIgnoreCase("large")){
            cost = 14 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
        }

        return cost;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", cost=" + calcCost() +
                '}';
    }
}
