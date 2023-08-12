package dz.manyTasks.inheritance.task1;

import dz.question.q7.C;

public class Animal {
    void makeSound(){
        System.out.println("Animal makes a sound.");
    }
}
class Cat extends Animal{
    @Override
    void makeSound() {
        System.out.println("Cat say meow.");
    }
}
class Test{
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
        Animal animal = new Animal();
        animal.makeSound();
    }
}
