package dz.thread.task3;

import util.ThreadUtils;

import java.util.ArrayList;
import java.util.List;

public class Resource {
     List<String> list = new ArrayList<>();

    public  synchronized void add(String s) {
        list.add(s);
        ThreadUtils.sleep(0.1);
    }
}
