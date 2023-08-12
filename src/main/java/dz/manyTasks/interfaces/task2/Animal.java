package dz.manyTasks.interfaces.task2;

public interface Animal {
    void bark();
}
class Dog implements Animal{

    @Override
    public void bark() {
        System.out.println("Dog is barking.");
    }
}
class Test{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
    }
}