package dz.question.q12;

public class Plant {
    private String name;

    public String getName() {
        return name;
    }

    public Plant(String name) {
        this.name = name;
    }

    public Plant() {
        this("fern");
    }


}

class Tree extends Plant {

    public Tree() {

    }

    public Tree(String name) {
        super(name);
    }

    public void growFruit() {
    }

    public void dropLeaves() {
    }
}

class Test {
    public static void main(String[] args) {
        Plant p = new Plant();
        System.out.println(p.getName());
        Tree t = new Tree();
        System.out.println(t.getName());

    }
}