package dz.question.q12;

public class Plant {
    private String name;

    public String getName() {
        return name;
    }

    public Plant(String name) {
        this.name = name;
    }

}
class Tree extends Plant{


    public Tree(String name) {
        super(name);
    }

    public void growFruit(){}
    public void dropLeaves(){}
}