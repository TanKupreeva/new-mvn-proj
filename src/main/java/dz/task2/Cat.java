package dz.task2;


public class Cat extends Animal implements Pet {
    String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat() {
        super(4);
        name = "Cat";
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eat mice.");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(getName() + " play with a ball o thread.");
    }

    @Override
    public void walk() {
        System.out.println(getName() + " walk on " + legs + " legs.");
    }


}


