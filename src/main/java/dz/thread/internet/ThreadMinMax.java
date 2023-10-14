package dz.thread.internet;

public class ThreadMinMax implements Runnable {
    private Thread thr;
    private int[] AI;
    private int maximum;
    private int minimum;

    public ThreadMinMax(int[] AI) {
        this.AI = AI;
        thr = new Thread(this, "Thread1.");
        thr.start();
    }

    @Override
    public void run() {
        int max = AI[0];
        int min = AI[0];
        for (int i = 1; i < AI.length; i++) {
            if (max < AI[i]) max = AI[i];
            if (min > AI[i]) min = AI[i];
        }
        maximum = max;
        minimum = min;

    }
    public Thread getThread(){
        return thr;
    }

    public int getMax(){
        return maximum;
    }
    public int getMin(){
        return minimum;
    }}

