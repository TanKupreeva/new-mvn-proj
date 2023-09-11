package collections;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MapTester {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(123, "John");
        map1.put(125, "Mike");
        System.out.println(map1.size());

        map1.forEach((k, v) -> {
            System.out.println("key: " + k + ", value: " + v);
        });

        Map<Passport, Human> map2 = new HashMap<>();
        map2.put(new Passport("MP124312", new Date()), new Human("Bob", "JJ", 50));
        map2.put(new Passport("MP124382", new Date()), new Human("Mike", "ZZ", 34));
        map2.put(new Passport("MP124311", new Date()), new Human("Bob", "JJ", 50));
        map2.put(new Passport("MP124212", new Date()), new Human("Mike", "ZZ", 34));
        map2.put(new Passport("MP124345", new Date()), new Human("Bob", "JJ", 50));
        map2.put(new Passport("MP124482", new Date()), new Human("Mike", "ZZ", 34));
        map2.put(new Passport("MP177312", new Date()), new Human("Bob", "JJ", 50));
        map2.put(new Passport("MP125782", new Date()), new Human("Mike", "ZZ", 34));
        map2.put(new Passport("MP125712", new Date()), new Human("Bob", "JJ", 50));
        map2.put(new Passport("MP124482", new Date()), new Human("Mike", "ZZ", 34));
        map2.put(new Passport("MP124512", new Date()), new Human("Bob", "JJ", 50));
        map2.put(new Passport("MP124662", new Date()), new Human("Mike", "ZZ", 34));
        map2.put(new Passport("MP124572", new Date()), new Human("Bob", "JJ", 50));
        map2.put(new Passport("MP155382", new Date()), new Human("Mike", "ZZ", 34));
        Passport mp124772 = new Passport("MP124772", new Date());
        map2.put(mp124772, new Human("Jack", "MM", 24));
        System.out.println(map2.get(mp124772).name);


        for (Map.Entry<Passport, Human> entry : map2.entrySet()) {
            Passport passport = entry.getKey();
            Human human = entry.getValue();
        }

        Map<Human, Map<Passport, Human>> map3 = new HashMap<>();
        map3.put(new Human("Alex", "AA", 18), map2);
        for (Map.Entry<Human, Map<Passport, Human>> entry : map3.entrySet()) {
            Human empl = entry.getKey();
            Map<Passport, Human> scope = entry.getValue();
            System.out.println("Notify:");
            for (Map.Entry<Passport, Human> entryInternal : scope.entrySet()) {
                System.out.println(entryInternal.getValue().name + " please take your passport with id " + entryInternal.getKey().id);
            }
        }
    }
}

class Passport {
    String id;
    Date exp;

    public Passport(String id, Date exp) {
        this.id = id;
        this.exp = exp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Passport passport = (Passport) o;

        if (id != null ? !id.equals(passport.id) : passport.id != null) return false;
        return exp != null ? exp.equals(passport.exp) : passport.exp == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (exp != null ? exp.hashCode() : 0);
        return result;
//        return 1;
    }
}

class Human {
    String name;
    String lName;
    int age;

    public Human(String name, String lName, int age) {
        this.name = name;
        this.lName = lName;
        this.age = age;
    }
}