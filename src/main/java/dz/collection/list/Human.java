package dz.collection.list;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;

@Data
@AllArgsConstructor
public class Human implements Comparable<Human> {
    private String name;
    private int age;
    private int iq;


    @Override
    public int compareTo(Human o) {
        return this.getName().compareTo(o.getName());
    }
}

@AllArgsConstructor
class HumanComporatorByAge implements Comparator<Human> {
    boolean asc = true;

    @Override
    public int compare(Human o1, Human o2) {
        return asc ? new Integer(o1.getAge()).compareTo(o2.getAge()) : new Integer(o2.getAge()).compareTo(o1.getAge());
    }
}
@AllArgsConstructor
class HumanComporatorByIQ implements Comparator<Human> {
    boolean asc = true;

    @Override
    public int compare(Human o1, Human o2) {
        return asc ? new Integer(o1.getIq()).compareTo(o2.getIq()) : new Integer(o2.getIq()).compareTo(o1.getIq());
    }
}
class HumanTester {
    public static void main(String[] args) {
        Human h1 = new Human("Tom", 22, 170);
        Human h2 = new Human("Ann", 23, 100);
        Human h3 = new Human("Bob", 25, 150);
        Human h4 = new Human("Kate", 40, 90);
        Human h5 = new Human("Sam", 77, 70);
        Human h6 = new Human("Jack", 54, 110);
        List<Human> list = new ArrayList<>(Arrays.asList(h1, h2, h3, h4, h5, h6));
        Collections.sort(list);
        // print with the help iterator
        Iterator<Human> iterator = list.iterator();
        while (iterator.hasNext()) {
            Human hName = iterator.next();
            System.out.println(hName);
        }
        System.out.println("*************************");
        // print with the help classic for
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("*************************");
        // print with the help forEach
        list.forEach(ob -> System.out.println(ob));
        System.out.println("*************************");

        Collections.sort(list, new HumanComporatorByAge(false));
        // print with the help iterator
        Iterator<Human> iterator1 = list.iterator();
        while (iterator1.hasNext()) {
            Human hAge = iterator1.next();
            System.out.println(hAge);
        }
        System.out.println("************************");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("************************");

        list.forEach(l -> System.out.println(l));
    }
}