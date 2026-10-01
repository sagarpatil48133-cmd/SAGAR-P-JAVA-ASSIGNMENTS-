abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    void area() {
        double r = 5;
        System.out.println("Area of Circle = " + (Math.PI * r * r));
    }
}

class Rectangle extends Shape {
    void area() {
        int l = 10, b = 5;
        System.out.println("Area of Rectangle = " + (l * b));
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Shape c = new Circle();
        Shape r = new Rectangle();

        c.area();
        r.area();
    }
}
