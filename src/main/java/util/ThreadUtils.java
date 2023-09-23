package util;

import java.util.Date;

public class ThreadUtils {
    public static void logBegin() {
        log("BEGIN");

    }

    public static void logFinish() {
        log("FINISH");
    }

    public static void log(Object text) {
        Thread th = Thread.currentThread();
        ;
        System.out.println(String.format("%s[%s]<%s>: [%d] %s (%d)", text.toString(), new Date().toString(),
                th.getState(), th.getId(), th.getName(), th.getPriority()));
    }

    public static void sleep(double second) {
//        log("start sleeping");

        try {
            Thread.sleep((int) (second * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        log("finish sleeping");

    }


    public static void sleep() {
        sleep((int) (Math.random() * 3));
    }

    public static void runInNewThread(Runnable target) {
        new Thread(target).start();
    }
}
