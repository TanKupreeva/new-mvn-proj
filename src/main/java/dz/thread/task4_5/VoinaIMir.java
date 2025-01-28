package dz.thread.task4_5;

import dz.streams_tasks.BufferedCharacterStream;

import java.util.Date;

public class VoinaIMir {
    public static void print(String p) {
        String str = BufferedCharacterStream.read("/Users/tatyanakupreeva/Documents/io_tests/война_и_мир.txt");
        StringBuilder sb = new StringBuilder(str);
        sb = sb.reverse();
        BufferedCharacterStream.write("/Users/tatyanakupreeva/Documents/io_tests/results/" + p + ".txt", sb.toString());
    }

    public static void main(String[] args) {


        DaemonThread daemon = new DaemonThread();
        daemon.start();

        Thread th1 = new Thread(() -> {
            VoinaIMir.print("thread_1_" + new Date());
            System.out.println("thread_1_" + new Date());
        });
        th1.start();

        Thread th2 = new Thread(() -> {
            VoinaIMir.print("thread_2_" + new Date());
            System.out.println("thread_2_" + new Date());

        });
        th2.start();

        Thread th3 = new Thread(() -> {
            VoinaIMir.print("thread_3_" + new Date());
            System.out.println("thread_3_" + new Date());

        });
        th3.start();

        Thread th4 = new Thread(() -> {
            VoinaIMir.print("thread_4_" + new Date());
            System.out.println("thread_4_" + new Date());

        });
        th4.start();

        Thread th5 = new Thread(() -> {
            VoinaIMir.print("thread_5_" + new Date());
            System.out.println("thread_5_" + new Date());

        });
        th5.start();

        Thread th6 = new Thread(() -> {
            VoinaIMir.print("thread_6_" + new Date());
            System.out.println("thread_6_" + new Date());

        });
        th6.start();

        Thread th7 = new Thread(() -> {
            VoinaIMir.print("thread_7_" + new Date());
            System.out.println("thread_7_" + new Date());

        });
        th7.start();

    }
}
