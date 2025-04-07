import java.util.Scanner;  // Importing Scanner class for user input

// Base class Shape (Not necessary, but can be added for structure)
abstract class Shape {
    abstract double area();
}

// Circle class
class Circle extends Shape {
    private double radius;

    // Constructor to initialize radius
    Circle(double radius) {
        this.radius = radius;
    }

    // Overloaded area method for Circle
    @Override
    double area() {
        return Math.PI * radius * radius;  // Area of circle: Pi * r^2
    }
}

// Rectangle class
class Rectangle extends Shape {
    private double length, width;

    // Constructor to initialize length and width
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overloaded area method for Rectangle
    @Override
    double area() {
        return length * width;  // Area of rectangle: length * width
    }
}

// Triangle class
class Triangle extends Shape {
    private double base, height;

    // Constructor to initialize base and height
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Overloaded area method for Triangle
    @Override
    double area() {
        return 0.5 * base * height;  // Area of triangle: 0.5 * base * height
    }
}

// Square class
class Square extends Shape {
    private double side;

    // Constructor to initialize side
    Square(double side) {
        this.side = side;
    }

    // Overloaded area method for Square
    @Override
    double area() {
        return side * side;  // Area of square: side * side
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Circle
        System.out.print("Enter the radius of the Circle: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);  // Circle with user input radius

        // Input for Rectangle
        System.out.print("Enter the length of the Rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the Rectangle: ");
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);  // Rectangle with user input length and width

        // Input for Triangle
        System.out.print("Enter the base of the Triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the Triangle: ");
        double height = scanner.nextDouble();
        Triangle triangle = new Triangle(base, height);  // Triangle with user input base and height

        // Input for Square
        System.out.print("Enter the side length of the Square: ");
        double side = scanner.nextDouble();
        Square square = new Square(side);  // Square with user input side length

        // Displaying the areas of different shapes
        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Triangle: " + triangle.area());
        System.out.println("Area of Square: " + square.area());

        scanner.close();  // Close the scanner to prevent resource leak
    }
}

