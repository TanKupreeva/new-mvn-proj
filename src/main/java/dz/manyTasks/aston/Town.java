package dz.manyTasks.aston;

public class Town {
    private String postcode = "3333";

    public class Street {
        public void printAddress() {
            System.out.println("Town is" + Town.this);
            System.out.println("Postcode is" + postcode);
            System.out.println("Street is " + this);
        }
    }

    public static void main(String[] args) {
        Town town = new Town();
        Street street = town.new Street();
        street.printAddress();
    }
}
