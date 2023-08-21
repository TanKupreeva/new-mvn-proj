package dz.manyTasks.abstract_classes.task4;

public abstract class Animal {
    abstract void eat();
    abstract void sleep();

}
class Lion extends Animal{

    @Override
    void eat() {
        System.out.println("Lion eat of deers");
    }

    @Override
    void sleep() {
        System.out.println("Lion sleep 6 hours");

    }
}
class Tiger extends Animal{

    @Override
    void eat() {
        System.out.println("Tiger eat of deers");
    }

    @Override
    void sleep() {
        System.out.println("Tiger sleep 5 hours");
    }
}
class Deer extends Animal{

    @Override
    void eat() {
        System.out.println("Deer eat a grasses");
    }

    @Override
    void sleep() {
        System.out.println("Deer sleep 4 hours");
    }
}
class Test{
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat();
        lion.sleep();
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.sleep();
        Deer deer= new Deer();
        deer.eat();
        deer.sleep();

    }
}