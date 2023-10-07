package dz.thread.task6;

public class Game {
    int number = 0;
    public synchronized void put(){
        while (number>0){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
