package dz.manyTasks.abstract_classes.task2;

public abstract class Shape {
    abstract double calculateArea();

    abstract double calculatePerimeter();

}

class Circle extends Shape {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * r;
    }
}

class Triangle extends Shape {
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double calculateArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }


    double calculatePerimeter() {
        return a + b + c;
    }
}

class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println("Perimetr of circle is " + circle.calculatePerimeter());
        System.out.println("Area of circle is " + circle.calculateArea());
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Perimetr of triangle is " + triangle.calculatePerimeter());
        System.out.println("Area of trianngle is " + triangle.calculateArea());


    }
}