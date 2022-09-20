package day28_Tasks;

public class Item {

    private String name;
    private double unitPrice;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isBlank() || name.isEmpty()){
            System.err.println("Invalid name");
            System.exit(1);
        }

        for (char each : name.toCharArray()) {
            if(!(Character.isLetterOrDigit(each) || each == ' ')){
                System.err.println("Name cannot contain special character other than space");
                System.exit(1);
            }
        }

        if(!((name.charAt(0) >= 'a' && name.charAt(0) <= 'z') || (name.charAt(0) >= 'A' && name.charAt(0) <= 'Z'))){
            System.err.println("Name must start with letters");
            System.exit(1);
        }
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if(unitPrice < 0){
            System.err.println("Unit price cannot be negative");
            System.exit(1);
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity < 0){
            System.err.println("Quantity cannot be negative");
            System.exit(1);
        }
        if(name.toLowerCase().equals("toilet paper")){
            if(quantity > 1){
                System.err.println("The quantity cannot be more than 1");
                System.exit(1);
            }
        }
        this.quantity = quantity;
    }

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public double calcCost(){
        return unitPrice * quantity;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", totalCost=" + calcCost() +
                '}';
    }
}
