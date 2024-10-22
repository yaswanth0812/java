interface Shape{
    double area();
    double perimeter();
}

class rectangle implements Shape {
    private double length;
    private double width;

    public rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

public class Shapes {
    public static void main(String[] args) {
        Shape myRectangle = new rectangle(5.0, 7.0);
        System.out.println("Rectangle Area:" + myRectangle.area());
        System.out.println("Rectangle Perimeter:" + myRectangle.perimeter());

        Shape myCircle = new Circle(3.5);
        System.out.println("Circle Area:" + myCircle.area());
        System.out.println("Circle Perimeter:" + myCircle.perimeter());
    }
}