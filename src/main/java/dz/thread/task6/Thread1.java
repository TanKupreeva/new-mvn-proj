package dz.thread.task6;

import java.util.ArrayList;
import java.util.List;

public class Thread1 {
    List<Integer> list = new ArrayList<>();

    public synchronized void put(int a) {
        int n = 0;
        while (n < 1) {
            n++;
            while (a > 0) {
                list.add((int) (Math.random() * 10));
                a--;
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        n--;
        notify();
    }


}
