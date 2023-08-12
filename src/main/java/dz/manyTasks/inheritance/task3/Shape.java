package dz.manyTasks.inheritance.task3;

public class Shape {
    double s;

    public void getArea() {

    }

}

class Rectangle extends Shape {
    int a;
    int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void getArea() {
        s = a * b;
        System.out.println("Area of rectangle is " + s);
    }
}

class Test{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3,4);
        rectangle.getArea();
    }
}