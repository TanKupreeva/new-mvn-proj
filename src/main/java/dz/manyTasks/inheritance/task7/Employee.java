package dz.manyTasks.inheritance.task7;

public class Employee extends Person {
    private String jobTitle;
    private int id;

    public Employee(String firstname, String lastname, String jobTitle, int id) {
        super(firstname, lastname);
        this.jobTitle = jobTitle;
        this.id = id;
    }

    public int getEmployeeId() {
        return id;
    }

    @Override
    public String getLastname() {
        return super.getLastname() + ", " + jobTitle;
    }
}
