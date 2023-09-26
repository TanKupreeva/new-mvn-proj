package dz.thread.task3;


public class ThreadMain {

    public static void main(String[] args) {

        // 1-ый способ implements
        Thread thA = new Thread(new ThreadA());
        thA.setName("Thread A");
        thA.start();

        // 2-ой способ extends
        ThreadB thB = new ThreadB();
        thB.setName("Thread B");
        thB.start();

        Thread thC = new Thread(new ThreadC());
        thC.setName("Thread C");
        thC.start();
    }
}