package dz.thread.task3;

import static util.ThreadUtils.*;

public class ThreadA implements Runnable {
    @Override
    public void run() {
        logBegin();
        log("Run thread A");

        Thread chA = new Thread(new ChildA());
        chA.setName("Child A");
        chA.start();
        try {
            chA.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        logFinish();
    }
}

 class ChildA implements Runnable{

    @Override
    public void run() {
        logBegin();
        log("Run thread child A");
        logFinish();
    }
}
