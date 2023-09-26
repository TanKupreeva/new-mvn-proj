package dz.thread.task1;


import static util.ThreadUtils.*;


public class ThreadMain {

    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        thread.setName("Main");
        logBegin();
        log("Run main thread");
        logFinish();
        // 1-ый способ implements
        Thread thA = new Thread(new ThreadA());
        thA.setName("Thread A");
        thA.start();

        // 2-ой способ extends
        ThreadB thB = new ThreadB();
        thB.setName("Thread B");
        thB.start();

        Thread thC = new Thread(new ThreadC());
        thC.setName("Thread C");
        thC.start();

//        // 3-ый способ lambda
//        Thread thC = new Thread(() -> {
//            logBegin();
//            log("Run thread C");
//            sleep(1);
//            logFinish();
//        });
//        thC.setName("Thread C");
//        thC.start();
//
//        // 4-ый способ wrapper
//        runInNewThread(() -> {
//            logBegin();
//            log("Run thread D");
//            sleep(1.5);
//            logFinish();
//        });     //??????как поменять имя
//
//        // 5-ый способ анонимный класс
//        Thread chD = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                logBegin();
//                log("Run thread D");
//                sleep(0.1);
//                logFinish();
//            }
//        });
    }
}