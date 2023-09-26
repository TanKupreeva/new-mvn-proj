package dz.thread.task2;

import static util.ThreadUtils.*;


public class ThreadMain {

    public static void main(String[] args) {
//        Thread thread = Thread.currentThread();
//        thread.setName("Main");
//        logBegin();
//        log("Run main thread");
//        logFinish();
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