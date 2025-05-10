// Abstract class
abstract class Shape {
    // Abstract method (no implementation)
    abstract double getArea();

    // Concrete method
    void display() {
        System.out.println("This is a shape");
    }
}

// Concrete class extending abstract class
class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing the abstract method
    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

public class Main1 {
    public static void main(String[] args) {
        // Creating an object of the concrete class
        Circle circle = new Circle(5);

        // Calling the methods
        circle.display(); // Output: This is a shape
        System.out.println("Area of the circle: " + circle.getArea()); // Output: Area of the circle: 78.53981633974483
    }
}