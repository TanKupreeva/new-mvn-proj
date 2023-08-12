package dz.question;

public class Q10 {
}

class Person {
    String name = "No name";

    public Person(String nm) {
        name = nm;
    }
}

class Employee extends Person {

    String empID = "0000";

    public Employee(String nm) {
        super(nm);
    }

    public Employee(String nm, String id) {
        super(nm);
        empID = id;
    }
}
class EmployeeTest{
    public static void main(String[] args) {
        Employee e = new Employee("4321");
        System.out.println(e.empID);
        System.out.println(e.name);
    }
}