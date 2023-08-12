package dz.manyTasks.interfaces.task1;

public interface Shape {
    void getArea();
}

class Rectangle implements Shape {
    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void getArea() {
        System.out.println("Area of rectangle is " + a * b);
    }
}

class Circle implements Shape {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public void getArea() {
        System.out.println("Area of circle is " + Math.PI * r * r);
    }
}

class Triangle implements Shape {
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void getArea() {
        double p = (a + b + c) / 2;
        System.out.println("Area of triangle is " + Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }
}

class Test {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2,3);
        r.getArea();
        Circle c = new Circle(5);
        c.getArea();
        Triangle t = new Triangle(10,10,8);
        t.getArea();
    }
}