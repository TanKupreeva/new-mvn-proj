package dz.thread.task3;




public class ThreadMain {

    public static void main(String[] args) {
        Resource r = new Resource();
        // 1-ый способ implements
        Thread thA = new Thread(new ThreadA());
        thA.setName("Thread A");
        thA.start();
        r.add(thA.getName());

        // 2-ой способ extends
        ThreadB thB = new ThreadB();
        thB.setName("Thread B");
        thB.start();
        r.add(thB.getName());

        Thread thC = new Thread(new ThreadC());
        thC.setName("Thread C");
        thC.start();
        r.add(thC.getName());



        System.out.println(r.list);
    }
}