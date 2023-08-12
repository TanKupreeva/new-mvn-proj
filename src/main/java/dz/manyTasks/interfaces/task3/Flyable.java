package dz.manyTasks.interfaces.task3;

public interface Flyable {
    void fly_obj();
}
class Spacecraft implements Flyable{

    @Override
    public void fly_obj() {
        System.out.println("Spacecraft is flying.");
    }
}
class Airplane implements Flyable{

    @Override
    public void fly_obj() {
        System.out.println("Airplane is flying.");

    }
}
class Helicopter implements Flyable{

    @Override
    public void fly_obj() {
        System.out.println("Helicopter is flying.");

    }
}
class Test{
    public static void main(String[] args) {
        Spacecraft spacecraft = new Spacecraft();
        spacecraft.fly_obj();
        Airplane airplane = new Airplane();
        airplane.fly_obj();
        Helicopter helicopter = new Helicopter();
        helicopter.fly_obj();
    }
}