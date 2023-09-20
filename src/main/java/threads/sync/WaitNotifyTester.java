package threads.sync;

import util.ThreadUtils;

public class WaitNotifyTester {
    public static void main(String[] args) {
        Store store = new Store();
        Thread th1 = new Thread(new Consumer(store));
        Thread th2 = new Thread(new Producer(store));
        th1.setName("Consumer");
        th2.setName("Producer");
        th1.start();
        th2.start();


    }
}

class Store {
    private int product = 0;

    public synchronized void get() {
        while (product ==0) {
            try {
                ThreadUtils.log("Start Waiting");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        ThreadUtils.sleep(0.2);
        product--;
        ThreadUtils.log("Consumer product + 1");
        ThreadUtils.log("Total Store products: " + product);
        ThreadUtils.log("notify ->");

        notify();
    }


    public synchronized void put() {
        while (product > 0) {
            try {
                ThreadUtils.log("Start Waiting");

                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        ThreadUtils.sleep(1);

        product++;
        ThreadUtils.log("Consumer product + 1");
        ThreadUtils.log("Total Store products: " + product);
        ThreadUtils.log("notify ->");

        notify();
    }
}

class Producer implements Runnable {
    private final Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            store.put();
        }
    }
}


class Consumer implements Runnable {
    private final Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            store.get();
        }
    }
}
