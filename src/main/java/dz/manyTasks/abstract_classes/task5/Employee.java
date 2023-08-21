package dz.manyTasks.abstract_classes.task5;

public abstract class Employee {
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract void calcuulateSalary();

    abstract void displayInfo();

}

class Manager extends Employee {

    public Manager(String name, int salary) {
        super(name, salary);
    }

    @Override
    void calcuulateSalary() {
        System.out.println("Salary of manager is " + salary);

    }

    @Override
    void displayInfo() {
        System.out.println(name+ " is a manager");
    }
}
class Programmer extends Employee{

    public Programmer(String name, int salary) {
        super(name, salary);
    }

    @Override
    void calcuulateSalary() {
        System.out.println("Salary of programmer is "+ salary);
    }

    @Override
    void displayInfo() {
        System.out.println(name+" is a programmer");
    }
}
class Test {
    public static void main(String[] args) {
        Manager manager = new Manager("Tom",1000);
        manager.calcuulateSalary();
        manager.displayInfo();
        Programmer programmer = new Programmer("Jerry",5000);
        programmer.calcuulateSalary();
        programmer.displayInfo();
    }
}