package dz.manyTasks.inheritance.task9;

public class Car extends Vehicle{
    public Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public double fuelEfficiency() {
        return 0;
    }

    @Override
    public double distanceTraveled() {
        return 0;
    }

    @Override
    public double maximumSpeed() {
        return 0;
    }
}
