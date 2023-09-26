package dz.thread.task1;

import static util.ThreadUtils.*;

public class ThreadA implements Runnable {
    @Override
    public void run() {
        logBegin();
        log("Run thread A");
        sleep(0.1);
        logFinish();
    }
}

