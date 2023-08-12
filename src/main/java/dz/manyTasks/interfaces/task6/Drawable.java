package dz.manyTasks.interfaces.task6;

public interface Drawable {
    void draw();
}
class Circle implements Drawable{

    @Override
    public void draw() {
        System.out.println("o");
    }
}

class Rectangle implements Drawable{

    @Override
    public void draw() {
        System.out.println("_____");
        System.out.println("|   |");
        System.out.println("-----");
    }
}

class Triangle implements Drawable{

    @Override
    public void draw() {
        System.out.println(" ^");
        System.out.println("/ \\");
        System.out.println("----");
    }
}
class Test{
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
        Rectangle r = new Rectangle();
        r.draw();
        Triangle t = new Triangle();
        t.draw();
    }}