package dz.manyTasks.interfaces.task5;

public interface Resizable {
    void resizeWidth(int width);

    void resizeHeight(int height);

}

class Rectangle implements Resizable {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }


    @Override
    public void resizeWidth(int width) {
        this.width = width;
    }

    @Override
    public void resizeHeight(int height) {
        this.height = height;
    }
    public void printSize() {
        System.out.println("Width: " + width + ", Height: " + height);
    }}
class Test{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(45,67);
        rectangle.printSize();
        rectangle.resizeWidth(55);
        rectangle.resizeHeight(12);
        rectangle.printSize();
    }
}