package day34_Tasks.carTask;

public abstract class Car {

    private final String make, model;
    private final int year;
    private double price;
    private String color;

    public Car(String make, String model, int year, double price, String color) {
        if(make == null || make.trim().isEmpty()){
            System.err.println("Invalid make: " + make);
            System.exit(1);
        }
        this.make = make;
        if(model == null || model.trim().isEmpty()){
            System.err.println("Invalid model: " + model);
            System.exit(1);
        }
        this.model = model;
        if(year < 1886){
            System.err.println("Invalid year: " + year);
            System.exit(1);
        }
        this.year = year;
        setPrice(price);
        setColor(color);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public void setPrice(double price) {
        if(price < 0){
            System.err.println("Invalid price: " + price);
            System.exit(1);
        }
        this.price = price;
    }

    public void setColor(String color) {
        if(color == null || color.trim().isEmpty()){
            System.err.println("Invalid color: " + color);
            System.exit(1);
        }
        this.color = color;
    }

    public abstract void start();

    public abstract void drive();

    public void stop(){
        System.out.println("Use brake to stop the car");
    }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
