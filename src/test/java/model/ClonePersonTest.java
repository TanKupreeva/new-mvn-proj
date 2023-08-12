package model;

public class ClonePersonTest {
    public static void main(String[] args) {
        Person p1 = new Person(123, " John", "Johnson", 43);
        Person p2 = new Person(123, " John", "Johnson", 43);
        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode() == p2.hashCode());

        Person p3 = new Person(333, " Bob", "Bobson", 43);
        Person p4 = new Person();
        p4.setId(p3.getId());
        p4.setName(p3.getName());
        p4.setLastName(p3.getLastName());
        p4.setAge(p3.getAge());
        p4.setCat(p3.getCat());
        System.out.println(("Clone correct ? "+p3.equals(p4)));
        Person p5 = new Person(p3.getId(),p3.getName(),p3.getLastName(),p3.getAge(),p3.getCat(), p3.getCar() );

        Person p6 = new Person(555, "Mike", "Tyson", 57);
        Person p7 = p6.clone();
        System.out.println(p6.equals(p7));

    }
}
