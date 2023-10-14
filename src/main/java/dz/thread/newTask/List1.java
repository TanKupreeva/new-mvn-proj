package dz.thread.newTask;

import util.ThreadUtils;

import java.util.ArrayList;
import java.util.List;

public class List1 {
    private List<Integer> l = new ArrayList<>();

    public synchronized void put() {
        while (l.size() > 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            int x = (int) Math.random() * 10;
            l.add(x);
            ThreadUtils.log("Thread1 put number");
            ThreadUtils.log("Number is " + x);
            ThreadUtils.log("Notify ->");
            notify();
        }
    }


    public synchronized void get() {
        while (l.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            int y = l.get(l.size() - 1);

            ThreadUtils.log("Thread2 get number");
            ThreadUtils.log("Number is " + y);
            if (y % 2 == 0) {
                System.out.println("Четное");
            } else System.out.println("Нечетное");
            ThreadUtils.log("Notify ->");
            notify();
        }
    }
}
