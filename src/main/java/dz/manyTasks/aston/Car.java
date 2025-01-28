package dz.manyTasks.aston;

import util.MathUtil;

import java.util.Objects;

public class Car implements Cloneable  {
    private String name;
    private Driver driver;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Car(String name, Driver driver) {
        this.name = name;
        this.driver = driver;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Car cloneCar = (Car) super.clone();
        Driver cloneDriver = (Driver) driver.clone();
        cloneCar.setDriver(cloneDriver);

        return cloneCar;
    }


    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = new Car("BMV", new Driver("Sam", 34));
        Car cloneCar = (Car) car.clone();
        Driver driver1 = cloneCar.getDriver();
        driver1.setName("Bob");
        car.getDriver().setName("Max");
        System.out.println(car.getDriver().getName());
        System.out.println(cloneCar.getDriver().getName());


    }
}
