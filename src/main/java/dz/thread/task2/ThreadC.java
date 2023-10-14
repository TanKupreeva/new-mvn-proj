package dz.thread.task2;




import static util.ThreadUtils.*;

public class ThreadC implements Runnable{

    @Override
    public void run() {
        logBegin();
        log("Run thread C");
        sleep(1);
        Thread chC = new Thread(new ChildC());
        chC.setName("Child C");
        chC.start();
        try {
            chC.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        logFinish();
    }
}
class ChildC implements Runnable {
    @Override
    public void run() {
        logBegin();
        log("Run child C");
      sleep(0.1);
        logFinish();
    }
}