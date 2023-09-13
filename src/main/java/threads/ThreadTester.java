package threads;

import java.util.Date;

import static util.ThreadUtils.*;

public class ThreadTester {
    public static void main(String[] args) throws InterruptedException {
        Thread currentTh = Thread.currentThread();
        currentTh.setName("MAIN");
        logBegin();
        currentTh.setPriority(10);

        System.out.println("Starting child ->");
        ChildThread ch = new ChildThread();
        ch.setName("CHILD");
        ch.start();// execute run () method in parallel thread
        System.out.println("Job main:");
        //start 15 exstra Child Threads
//        for (int i = 0; i < 15; i++) {
//            ChildThread child = new ChildThread();
//            child.setName("CHILD EXTRA THREAD #" + i);
//            child.start();
//        }
        ChildThread2 ch2 = new ChildThread2();
        new Thread(ch2).start();
        for (int i = 0; i < 5; i++) {
            Thread.sleep(500);
            log(i);
        }

//lambda way
        new Thread(() -> {
            log("Lambda parallel Thread");
        }).start();
//using wrapper method
        runInNewThread(() -> log("Lambda2 parallel Thread"));

        //

        new Thread(new Runnable() {
            @Override
            public void run() {
                log("internal class parallel Thread");
            }
        }).start();
        logFinish();
    }

}
