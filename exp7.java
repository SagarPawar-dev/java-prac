// Interface
interface Drawable {
    void draw();
}

// Abstract Class
abstract class Shape {
    abstract double area();
}

// Concrete class extending Abstract Class and implementing Interface
class Circle extends Shape implements Drawable {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double area() {
        return 3.1416 * radius * radius;
    }

    public void draw() {
        System.out.println("Drawing Circle...");
    }
}

public class exp7 {
    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        c.draw();
        System.out.println("Area of Circle: " + c.area());
    }
}
