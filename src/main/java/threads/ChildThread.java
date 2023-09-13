package threads;

import java.util.Date;

import static util.ThreadUtils.*;

public class ChildThread extends Thread {
    //своя работа
    //own job in parallel thread
    @Override
    public void run() {
        logBegin();
        this.setPriority(10);
        System.out.println("Job child:");
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            log(i);
        }
        logFinish();
    }
}
