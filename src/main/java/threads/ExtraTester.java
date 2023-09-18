package threads;

import static util.ThreadUtils.*;

public class ExtraTester {
    public static void main(String[] args) throws InterruptedException {
        logBegin();
        DaemonThread daemon = new DaemonThread();
        daemon.start();
        ExtraThread extraThread = new ExtraThread("Generator",10);
        extraThread.start();

//        extraThread.disable();
        extraThread.join(2000);
        logFinish();
    }
}
