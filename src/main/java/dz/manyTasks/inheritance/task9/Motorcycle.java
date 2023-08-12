package dz.manyTasks.inheritance.task9;

public class Motorcycle extends Vehicle{
    public Motorcycle(String make, String model, int year, String fuelType) {
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
