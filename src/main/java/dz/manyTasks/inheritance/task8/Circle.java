package dz.manyTasks.inheritance.task8;

public class Circle extends Shape {
    private double r;


    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getPerimetr() {
        return 2*Math.PI*r;
    }

    @Override
    public double getArea() {
        return Math.PI*r*r;
    }
}
