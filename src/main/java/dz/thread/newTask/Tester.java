package dz.thread.newTask;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input number");
        int n = sc.nextInt();
        List1 l = new List1();
        Thread th1 = new Thread(new Thread1(l, n));
        Thread th2 = new Thread(new Thread2(l, n));
        th1.setName("Thread1");
        th2.setName("Thread2");
        th1.start();
        th2.start();
    }
}

class Thread1 implements Runnable {
    private final List1 l;
    int n;

    Thread1(List1 l, int n) {
        this.l = l;
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 0; i < n; i++) {
            l.put();
        }
    }
}

class Thread2 implements Runnable {
    private final List1 l;
    int n;

    Thread2(List1 l, int n) {
        this.l = l;
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 0; i < n; i++) {
            l.get();
        }
    }
}