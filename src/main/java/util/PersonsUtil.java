package util;

import errors.CarNotFoundException;
import model.Car;
import model.Person;

public class PersonsUtil {

    public static void drive(Person p) throws CarNotFoundException {

        Car car =null;
        try {
            car = p.getCar();

        } catch (NullPointerException e ) {
            throw new CarNotFoundException("Person is null", e);
        }

        if (car == null)
            throw new CarNotFoundException();// покидаем метод


        if (car.getModel() == null) {
            throw new CarNotFoundException("Model is not populated");// покидаем метод

        }
        System.out.println(p.getName() + " is driving " + p.getCar().getModel());
    }
}
