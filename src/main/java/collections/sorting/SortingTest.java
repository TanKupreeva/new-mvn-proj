package collections.sorting;

import lombok.AllArgsConstructor;
import lombok.Data;
import model.Car;
import model.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingTest {
    public static void main(String[] args) {

        Comparable c;
        Person p1 = new Person(1, "Mike", "Jackson", 40);
        Person p2 = new Person(2, "Mike", "Ivanov", 42);
        Person p3 = new Person(3, "Mike", "Petrov", 85);
        Person p4 = new Person(4, "Mike", "Tyson", 12);
        Person p5 = new Person(5, "Mike", "Sidorov", 73);
        Person p6 = new Person(6, "Mike", "Smith", 33);

        Car c1 = new Car(88, "BMW 3");
        Car c2 = new Car(222, "BMW 4");
        Car c3 = new Car(53, "BMW 5");
        Car c4 = new Car(4444, "BMW 6");
        Car c5 = new Car(5, "audi");
        Car c6 = new Car(6, "mercedes");
        p1.setCar(c1);
        p2.setCar(c2);
        p3.setCar(c3);
        p4.setCar(c4);
        p5.setCar(c5);
        p6.setCar(c6);


        List<Person> persons = Arrays.asList(p1, p2, p3, p4, p5, p6);


        //1st
        System.out.println(persons);
        Collections.shuffle(persons);
        System.out.println(persons);
        Collections.sort(persons);
        System.out.println(persons);


        List<String> strs = Arrays.asList("BB", "AAA", "AA", "Y", "CC");
        Collections.sort(strs);
        System.out.println(strs);

        List<Car> cars = Arrays.asList(new Car(), new Car());
        Collections.sort(cars);

        //2nd via Comparator
        Collections.sort(persons, new PersonsByCarIDComparator());
        System.out.println(persons);

        Pizza pi1 = new Pizza('s', "Cheese", true, 2100);
        Pizza pi2 = new Pizza('m', "Vegan", false, 750);
        Pizza pi3 = new Pizza('m', "Vegan", true, 800);
        Pizza pi4 = new Pizza('m', "Peperoni", true, 900);
        Pizza pi5 = new Pizza('l', "Peperoni", true, 1200);

        List<Pizza> pizzas = Arrays.asList(pi1, pi2, pi3, pi4, pi5);
        Collections.sort(pizzas);
        System.out.println(pizzas);
        Collections.sort(pizzas, PizzaByNameComparator.BY_NAME);


    }
}


class PersonsByCarIDComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        System.out.println("PersonsByCarComparator -> compare");
        return o1.getCar().compareTo(o2.getCar());
    }
}

class PersonsByAgeComparator implements Comparator<Person> {
    private boolean asc = true;

    public PersonsByAgeComparator(boolean asc) {
        this.asc = asc;
    }

    public PersonsByAgeComparator() {

    }

    @Override
    public int compare(Person o1, Person o2) {
        return asc ?
                new Integer(o1.getAge()).compareTo(o2.getAge())
                :
                new Integer(o2.getAge()).compareTo(o1.getAge());
    }
}

@Data
@AllArgsConstructor
class Pizza implements Comparable<Pizza> {
    private char size;// 's', 'm','l'
    private String name;
    private boolean isThin;
    private long kcal;


    @Override
    public int compareTo(Pizza o) {
        return Long.valueOf(kcal).compareTo(o.kcal);
    }
}

class PizzaByNameComparator implements Comparator<Pizza> {
    public static PizzaByNameComparator BY_NAME = new PizzaByNameComparator();

    private PizzaByNameComparator() {

    }

    @Override
    public int compare(Pizza o1, Pizza o2) {
        return o1.getName().compareTo(o2.getName());
    }
}