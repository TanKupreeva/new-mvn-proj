package dz.manyTasks.aston;

import java.util.Objects;

public class Animal {

    String name;
    String age;

    public Animal(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name) && Objects.equals(age, animal.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Шарик", "9");
        Animal dog = new Cat("Шарик", "9");
        System.out.println(cat.equals(dog));

    }
}
