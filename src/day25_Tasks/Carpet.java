package day25_Tasks;

public class Carpet {

    public double width;
    public double length;
    public double unitPrice;
    public boolean isPersian;

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", total cost =" + calcCost() +
                '}';
    }

    public double calcCost(){
        double totalCost = (width * length) * unitPrice;
        if(isPersian){
            totalCost += 200;
        }

        return totalCost;
    }

    public static void main(String[] args) {

        Carpet carpet = new Carpet(3,5,100,true);
        System.out.println(carpet);
    }

}
