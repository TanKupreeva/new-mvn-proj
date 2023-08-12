package dz.manyTasks.inheritance.task7;

public class Test {
    public static void main(String[] args) {
        Employee e1 = new Employee("Tom", "Hibson", "manager", 23);
        System.out.println(e1.getFirstname() + " " + e1.getLastname() + " (" + e1.getEmployeeId() + ")");
        Employee e2 = new Employee("Rosa", "Robinson", "director", 99);
        System.out.println(e2.getFirstname() + " " + e2.getLastname() + " (" + e2.getEmployeeId() + ")");

    }
}
