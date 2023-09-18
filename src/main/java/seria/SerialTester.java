package seria;

import lombok.Data;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class SerialTester {
    public static void main(String[] args) throws IOException {
        //Serelization in file
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\io_tests\\seria\\user.txt"));
//        Location l1 = new Location();
//        l1.setPostalCode(123);
//        l1.setAddress("BLR, Minsk, K.Marksa 32");
//        User u1 = new User();
//        u1.setId(111);
//        u1.setName("Bill");
//        u1.setLastName("Johnsons");
//        u1.setPassword("12345678");
//        u1.setLocation(l1);
//
//        Location l2 = new Location();
//        l2.setPostalCode(123);
//        l2.setAddress("BLR, Minsk, K.Marksa 32");
//        User u2 = new User();
//        u2.setId(111);
//        u2.setName("Tom");
//        u2.setLastName("AA");
//        u2.setPassword("12345678");
//        u2.setLocation(l2);
//
//        Location l3 = new Location();
//        l3.setPostalCode(123);
//        l3.setAddress("BLR, Minsk, K.Marksa 32");
//        User u3 = new User();
//        u3.setId(111);
//        u3.setName("Kate");
//        u3.setLastName("Johnsons");
//        u3.setPassword("12345678");
//        u3.setLocation(l3);
//
//        Location l4 = new Location();
//        l4.setPostalCode(123);
//        l4.setAddress("BLR, Minsk, K.Marksa 32");
//        User u4 = new User();
//        u4.setId(111);
//        u4.setName("Sam");
//        u4.setLastName("Johnsons");
//        u4.setPassword("12345678");
//        u4.setLocation(l4);
//
//
//        oos.writeObject(Arrays.asList(u1, u2, u3, u4));
//        oos.close();
//        System.out.println(u1);
        //deserialization (converting from bytes into Java Object)
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\io_tests\\seria\\user.txt"));
        try {
            ((List) ois.readObject()).forEach(u -> System.out.println(u));

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

@Data
class User implements Serializable {
    private final long serialVersionUID = 5810920551404927423L;
    private String name;
    private int id;

    private transient String password;

    private transient String lastName;
    private Location location;
}

@Data
class Location implements Serializable {
    private static final long serialVersionUID = -923793196155640491L;
    private String address;
    private int postalCode;
}
@Data
class Home implements Serializable {
    private static final long serialVersionUID = 1L;
    private String address;
    private int postalCode;
}