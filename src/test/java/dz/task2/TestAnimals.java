package dz.task2;


public class TestAnimals {
    public static void voidPrint(Pet pet) {
        if (pet instanceof Cat) {
            Cat cat = (Cat) pet;
            cat.eat();
            cat.walk();
            cat.play();
        }
        if (pet instanceof Fish) {
            Fish fish = (Fish) pet;
            fish.eat();
            fish.walk();
            fish.play();
        }

    }

    public static void voidPrint(Animal animal) {
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.eat();
            cat.walk();
            cat.play();
        }
        if (animal instanceof Fish) {
            Fish fish = (Fish) animal;
            fish.eat();
            fish.walk();
            fish.play();
        }
        else {
            animal.eat();
            animal.walk();
        }

    }


    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Spider s = new Spider();
        Animal a = new Fish();
        Animal e = new Spider();
        Animal l = new Cat("Tom");
        Pet p = new Cat();
        Pet m = new Fish("Flounder");

        Animal[] animals = {d, c, s, a, e, l};
        Pet[] pets = {p, m};
        for (Animal anyanimal : animals) {
            voidPrint(anyanimal);
        }

        for (Pet anypet : pets) {
            voidPrint(anypet);
        }


    }


}
