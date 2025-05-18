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

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle("Круг", 5);
        Shape rectangle = new Rectangle("Прямоугольник", 4, 6);

        System.out.println(circle.name + ": площадь = " + circle.calculateArea());
        System.out.println(rectangle.name + ": площадь = " + rectangle.calculateArea());
    }
}