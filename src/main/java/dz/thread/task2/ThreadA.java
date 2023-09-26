package dz.thread.task2;

import static util.ThreadUtils.*;

public class ThreadA implements Runnable {
    @Override
    public void run() {
        logBegin();
        log("Run thread A");
        sleep(0.1);

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
        sleep(2);
        logFinish();
    }
}
