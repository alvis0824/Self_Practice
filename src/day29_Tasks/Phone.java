package day29_Tasks;

public class Phone {

    private String brand;
    private String model;
    private String size;
    private double price;
    private String color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if(brand == null || brand.trim().isEmpty()){
            System.err.println("Invalid brand: " + brand);
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model == null || model.trim().isEmpty()){
            System.err.println("Invalid model: " + model);
            System.exit(1);
        }
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <= 0){
            System.err.println("Invalid price: " + price);
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color == null || color.trim().isEmpty()){
            System.err.println("Invalid color: " + color);
            System.exit(1);
        }
        this.color = color;
    }

    public void setInfo(String brand, String model, String size, double price, String color) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setPrice(price);
        setColor(color);
    }

    public void call(long phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println("Texting " + phoneNumber);
    }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
