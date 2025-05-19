import java.util.Scanner;

abstract class Shape {
    String name;

    Shape(String name) {
        this.name = name;
    }

    abstract double calculateArea();
}

class Circle extends Shape {
    double radius;

    Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double width, height;

    Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }
}

// Треугольник
class Triangle {
    String name;
    String color;
    double base;
    double height;

    Triangle(String name, String color, double base, double height) {
        this.name = name;
        this.color = color;
        this.base = base;
        this.height = height;
    }

    double calculateArea() {
        return (base * height) / 2;
    }

    void displayInfo() {
        System.out.println(color + " " + name + ": площадь = " + calculateArea());
    }
}

// Эллипс
class Ellipse extends Shape {
    double majorAxis, minorAxis;

    Ellipse(String name, double majorAxis, double minorAxis) {
        super(name);
        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;
    }

    @Override
    double calculateArea() {
        return Math.PI * majorAxis * minorAxis;
    }
}

public class Square_2 {
    public static void main(String[] args) {
        Shape circle = new Circle("Круг", 5);
        Shape rectangle = new Rectangle("Прямоугольник", 4, 6);
        Triangle blueTriangle = new Triangle("Треугольник", "Синий", 3, 4);
        Shape ellipse = new Ellipse("Эллипс", 5, 3);

        System.out.println(circle.name + ": площадь = " + circle.calculateArea());
        System.out.println(rectangle.name + ": площадь = " + rectangle.calculateArea());
        System.out.println(blueTriangle.name + ", " + blueTriangle.color + ", площадь = " + blueTriangle.calculateArea());
        System.out.println(ellipse.name + ": площадь = " + ellipse.calculateArea());
    }
}