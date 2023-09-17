package dz.collection.set;

import java.util.*;
import java.util.stream.Collectors;

public class HumanSetTester {
    public static void main(String[] args) {
        Comparator<Human> humanComparator = Comparator.comparing(Human::getIq).thenComparing(Human::getName).thenComparing(Human::getAge);
        SortedSet<Human> set = new TreeSet<>(humanComparator);
        set.add(new Human("John", 35, 120));
        set.add(new Human("John", 35, 120));
        set.add(new Human("Ann", 55, 180));
        set.add(new Human("Ann", 35, 111));
        set.add(new Human("Bob", 21, 123));
        set.add(new Human("Tom", 45, 176));
        set.add(new Human("Jack", 18, 123));
        double avg = 0;

        Iterator<Human> iterator = set.iterator();
        while (iterator.hasNext()) {
            Human h = iterator.next();
            avg = avg + h.getIq();
            System.out.println(String.format("<%s>:<%d>:<%d>", h.getName().toUpperCase(), h.getAge(), h.getIq()));
        }
        System.out.println(set.stream().collect(Collectors.toSet()));
        System.out.println("**********************");
        set.forEach(s -> System.out.println(s));

        int max = 0;
        int min = 0;
        Iterator<Human> iterator2 = set.iterator();
        if (iterator2.hasNext()) {
            Human h = iterator2.next();
            max = h.getIq();
            min = h.getIq();
        }
        while (iterator2.hasNext()) {
            Human h = iterator2.next();
            if (h.getIq() > max) {
                max = h.getIq();
            }
            if (h.getIq() < min) {
                min = h.getIq();
            }
        }
        System.out.println("Max iq is " + max);
        System.out.println("Min iq is " + min);
        avg = avg / set.size();
        System.out.println("Averige iq=" + avg);
        Iterator<Human> iterator1 = set.iterator();
        while (iterator1.hasNext()) {
            Human h = iterator1.next();
            if (h.getIq() < avg) {
                iterator1.remove();
            }
        }

        System.out.println("people who have an IQ above average:");
        set.forEach(s -> System.out.println(s));


    }


}
