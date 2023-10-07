package dz.thread.task3;


import lombok.var;

public class ThreadMain {

    public static void main(String[] args) {

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

        Resource r = new Resource();
        r.add(thA.getName());
        r.add(thB.getName());
        r.add(thC.getName());

        System.out.println(r.list);
    }
}