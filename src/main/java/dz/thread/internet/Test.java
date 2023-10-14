package dz.thread.internet;

public class Test {
    public static void main(String[] args) {

        int[] AI = {2, 3, 4, 8, -1};
        ThreadMinMax t1 = new ThreadMinMax(AI);
        ThreadMinMax t2 = new ThreadMinMax(AI);

        try {
            t1.getThread().join();
            t2.getThread().join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("max = " + t1.getMax());
        System.out.println("min = " + t1.getMin());

    }

}




