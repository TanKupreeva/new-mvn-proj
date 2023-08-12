package dz.manyTasks.inheritance.task6;

import dz.question.A;

public class Animal {
    public void move(){
        System.out.println("Animal moves.");
    }}
    class Cheetah extends Animal{
        @Override
        public void move() {
            System.out.println("This cheetah is running!");
        }
    }

class Test{
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.move();
        Cheetah cheetah = new Cheetah();
        cheetah.move();
    }
}