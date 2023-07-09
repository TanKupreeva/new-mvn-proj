package dz.task2;

public class Spider extends Animal {
    @Override
    public void eat() {
        System.out.println("Spider eat flies.");
    }

    @Override
    public void walk() {
        System.out.println("Spider walk on " + legs + " legs");
    }

    public Spider() {
        super(8);
    }

}