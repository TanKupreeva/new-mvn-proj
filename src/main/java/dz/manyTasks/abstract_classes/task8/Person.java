package dz.manyTasks.abstract_classes.task8;

public abstract class Person {
    String name;
    abstract void eat();
    abstract void exercize();

    public Person(String name) {
        this.name = name;
    }
}
class Athlete extends Person{

    public Athlete(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Athlete eat healthly food");
    }

    @Override
    void exercize() {
        System.out.println("Athlete do sports every day");
    }
}
class LazyPerson extends Person{

    public LazyPerson(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("LazyPerson eat fastfood");
    }

    @Override
    void exercize() {
        System.out.println("LazyPerson don't exercize");
    }
}
class Test{
    public static void main(String[] args) {
        Athlete athlete = new Athlete("Bob");
        athlete.eat();
        athlete.exercize();
        LazyPerson lazyPerson = new LazyPerson("Jim");
        lazyPerson.eat();
        lazyPerson.exercize();
    }
}