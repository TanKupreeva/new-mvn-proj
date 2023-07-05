package abs;

//100% абстрфктный класс.
public interface Playable {
    //public abstract by default
    void play();

    public abstract void stop();

    //by fefault the field is public and static final (constant)
    double PI = 3.14;

    public static final double X = 0.99;

}
