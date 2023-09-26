package dz.thread.task1;

import util.ThreadUtils;

import static util.ThreadUtils.*;


public class ThreadB extends Thread {
    @Override
    public void run() {
        logBegin();
        //??????? sleep
        ThreadUtils.sleep(0.5);
        log("Run thread B");
        logFinish();

    }
}