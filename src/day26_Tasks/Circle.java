package day26_Tasks;

public class Circle {

    public double radius;
    public double diameter;
    public static double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
        this.diameter = 2 * radius;
    }

    public double calcArea(){
        return pi * radius * radius;
    }

    public double calcPerimeter(){
        return 2 * pi * radius;
    }

    public static void printPi(){
        System.out.println(pi);
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", PI = " + pi +
                ", Area = " + calcArea() +
                ", Perimeter = " + calcPerimeter() +
                '}';
    }

    public static void main(String[] args) {

        Circle circle = new Circle(3);
        System.out.println(circle);

    }
}
