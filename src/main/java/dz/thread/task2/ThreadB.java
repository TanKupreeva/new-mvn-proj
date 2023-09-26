package dz.thread.task2;


import util.ThreadUtils;

import static util.ThreadUtils.*;

public class ThreadB extends Thread {
    @Override
    public void run() {
        logBegin();
        log("Run thread B");
        ThreadUtils.sleep(0.5);
        ChildB chB = new ChildB();
        chB.setName("Child B");
        chB.start();
        try {
            chB.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        logFinish();

    }
}

class ChildB extends ThreadB {
    @Override
    public void run() {
        logBegin();
        log("Run child B");
        ThreadUtils.sleep(1);
        logFinish();
    }
}