package threads.sync;

import util.ThreadUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class SynTest {
    public static void main(String[] args) {
//        Resource resource = new Resource();
//        for (int i = 0; i < 7; i++) {
//            Thread th = new Thread(new ResourceUser(resource));
//            th.setName("TH#" + i);
//            th.start();
//        }
        SynchResource synchResource = new SynchResource();

        for (int i = 0; i < 7; i++) {
            Thread th = new Thread(new SynchResourceUser(synchResource));
            th.setName("TH#" + i);
            th.start();
        }
    }
}


class Resource {
    private List<Long> ids = new ArrayList<>();//TODO  Alternative change to Vector()

    public List<Long> getIds() {
        return ids;
    }
}

class ResourceUser implements Runnable {
    private final Resource resource;

    public ResourceUser(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        ThreadUtils.logBegin();
        synchronized (resource) {
            resource.getIds().clear();//delete all IDs
            for (int i = 0; i < 7; i++) {

                resource.getIds().add(Thread.currentThread().getId());
                ThreadUtils.sleep(0.1);
                ThreadUtils.log("IDs Size: " + resource.getIds().size() + "| LIST: " + resource.getIds());
            }
        }
        ThreadUtils.logFinish();

    }
}


class SynchResource {
    private int value = 0;

    public synchronized void increment() {
        for (int i = 0; i < 7; i++) {
            ThreadUtils.sleep(0.1);
            value++;
            ThreadUtils.log("inside increment: " + value);

        }
    }

    public synchronized void print() {
        ThreadUtils.log("inside print" + value);
    }
}

class SynchResourceUser implements Runnable {

    private final SynchResource synchResource;

    public SynchResourceUser(SynchResource synchResource) {
        this.synchResource = synchResource;
    }

    @Override
    public void run() {
        ThreadUtils.logBegin();
        synchResource.increment();
        synchResource.print();
        ThreadUtils.logFinish();
    }

}
