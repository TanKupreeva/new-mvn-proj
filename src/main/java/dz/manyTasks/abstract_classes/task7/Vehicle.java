package dz.manyTasks.abstract_classes.task7;

public abstract class Vehicle {
    abstract  void startEngine();
    abstract void stopEngine();
}
class Car extends Vehicle{

    @Override
    void startEngine() {
        System.out.println("Car: Starting the engine...");
    }

    @Override
    void stopEngine() {
        System.out.println("Car: Stopping the engine...");
    }
}
class Motorcycle extends Vehicle{

    @Override
    void startEngine() {
        System.out.println("Motorcycle: Starting the engine...");
    }

    @Override
    void stopEngine() {
        System.out.println("Motorcycle: Stopping the engine...");
    }
}
class Test {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
        car.stopEngine();
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}