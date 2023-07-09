package dz.task2;


import lombok.NoArgsConstructor;

@NoArgsConstructor
public abstract class Animal {


    protected int legs;
    protected Animal(int legs) {
        this.legs = legs;
    }
    public abstract void eat();


    public void walk() {
        System.out.println("It is walking on " + legs + " legs");
    }

}


