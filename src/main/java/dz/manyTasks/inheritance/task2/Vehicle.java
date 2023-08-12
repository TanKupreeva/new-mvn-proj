package dz.manyTasks.inheritance.task2;

public class Vehicle {
    public void drive(){
        System.out.println("Repairing a vehicle.");
    }
}
class Car extends Vehicle{
    @Override
   public void drive() {
        System.out.println("Repairing a car.");
    }
}
class Test{
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.drive();
        Car car = new Car();
        car.drive();
    }
}