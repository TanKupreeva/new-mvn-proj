package dz.manyTasks.aston;

public class Town2 {
    private String postcode = "55555";

    public void createAdress() {
        final int housenumber = 34;
        class Street {
            public void printAddress() {
                System.out.println("Postcode is " + postcode);
                System.out.println("Homenumber is " + housenumber);
            }

        }
        new Street().printAddress();

    }

    public static void main(String[] args) {

        Town2 town2 = new Town2();
        town2.createAdress();

    }
}
