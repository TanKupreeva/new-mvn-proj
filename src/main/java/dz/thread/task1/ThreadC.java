package dz.thread.task1;

import static util.ThreadUtils.*;
import static util.ThreadUtils.logFinish;

public class ThreadC implements Runnable{

    @Override
    public void run() {
        logBegin();
        log("Run thread C");
        sleep(1);
        logFinish();
    }
}
