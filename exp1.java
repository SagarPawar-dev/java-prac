class Rectangle {
    double length, breadth;

    Rectangle() {
        length = 0;
        breadth = 0;
    }

    Rectangle(double s) {
        length = breadth = s;
    }

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    double area() {
        return length * breadth;
    }
}

public class exp1 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5);
        Rectangle r3 = new Rectangle(4, 6);

        System.out.println("Default: " + r1.area());
        System.out.println("Square: " + r2.area());
        System.out.println("Rectangle: " + r3.area());
    }
}
