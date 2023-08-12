package dz.manyTasks.inheritance.task4;

public class Employee {
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void work() {
        System.out.println(name+" is working");
    }

    public int getSalary() {
        return salary;
    }
}

class HRManager extends Employee {

    public HRManager(String name, int salary) {
        super(name, salary);
    }

    public void addEmployee() {
        System.out.println("Adding a new employee");
    }
}
class Test{
    public static void main(String[] args) {
        Employee employee=new Employee("Bob",1500);
        employee.work();
        System.out.println("Salary employee is " + employee.getSalary());
        HRManager hrManager= new HRManager("Sam",2000);
        hrManager.work();
        System.out.println("Salary manager is "+ hrManager.getSalary());
        hrManager.addEmployee();
    }
}