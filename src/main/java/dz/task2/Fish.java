package dz.task2;



public class Fish extends Animal implements Pet {
    String name;

    public Fish() {
        name = "Fish";
    }
    public Fish(String name) {
        this.name=name;
    }
    @Override
    public void eat() {
        System.out.println(getName() + " eat worms.");
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
        System.out.println(getName() + " can't to walk.");

    }

    @Override
    public void walk() {
        System.out.println(getName() + " don't have leg's.");
    }


}
