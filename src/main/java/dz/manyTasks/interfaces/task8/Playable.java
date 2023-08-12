package dz.manyTasks.interfaces.task8;

public interface Playable {
    void play();
}
class Football implements Playable{
    @Override
    public void play() {
        System.out.println("Playing football.");
    }
}

class Volleyball implements Playable{
    @Override
    public void play() {
        System.out.println("Playing volleyball.");
    }
}
class Basketball implements Playable{

    @Override
    public void play() {
        System.out.println("Playing basketball.");
    }
}
class Test{
    public static void main(String[] args) {
        Football f = new Football();
        f.play();
        Volleyball v = new Volleyball();
        v.play();
        Basketball b = new Basketball();
        b.play();
    }
}