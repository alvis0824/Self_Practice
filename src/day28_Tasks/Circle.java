package day28_Tasks;

public class Circle {

        private double radius;
        public double pi = 3.14;

        public Circle(double radius) {
                setRadius(radius);
        }

        public double getRadius() {
                return radius;
        }

        public void setRadius(double radius) {
                if(radius <= 0){
                        System.err.println("Radius cannot be zero or negative");
                        System.exit(1);
                }
                this.radius = radius;
        }

        public double calcArea(){
                return radius * pi * radius;
        }

        public double calcPerimeter(){
                return 2 * pi * radius;
        }

        public String toString() {
                return "Circle{" +
                        "radius=" + radius +
                        "area=" + calcArea() +
                        "perimeter=" + calcPerimeter() +
                        '}';
        }
}
