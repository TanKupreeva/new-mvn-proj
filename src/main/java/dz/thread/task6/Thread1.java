package dz.thread.task6;

import java.util.ArrayList;
import java.util.List;

public class Thread1 implements Runnable {
    List<Integer> list = new ArrayList<>();


    @Override
    public void run() {
        int a = 6;

        while (a > 0) {
            list.add((int) (Math.random() * 10));
            a--;

        }
        System.out.println(list);
    }}
