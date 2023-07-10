package abs;

public interface Drawable extends Printable {
    void draw();

}
class Triangle implements Drawable{

    @Override
    public void draw() {
        System.out.println(" /\\");
        System.out.println("/__\\ ");

    }

    @Override
    public void print() {

    }
}
class Tester{
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.draw();
        t.printDefault();
    }

}