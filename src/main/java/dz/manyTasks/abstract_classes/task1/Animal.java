package dz.manyTasks.abstract_classes.task1;

import dz.question.q18.A;

public abstract class Animal {
    public abstract void sound();
}
class Lion extends Animal{

    @Override
    public void sound() {
        System.out.println("Lion roars");
    }
}
class Tiger extends Animal{

    @Override
    public void sound() {
        System.out.println("Tiger roars");
    }
}
class Test{
    public static void main(String[] args) {
        Lion lion= new Lion();
        lion.sound();
        new Tiger().sound();
    }
}
