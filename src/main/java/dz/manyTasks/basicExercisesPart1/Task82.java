package dz.manyTasks.basicExercisesPart1;

public class Task82 {
    public static void main(String[] args) {
        int[] x = {20, 30, 40, 50, 67};
        System.out.println("Largest element between first, last, and middle values: " + max(x));
    }

    public static int max(int[] a) {
        int middle = a.length / 2;
        int m = a[0];
        if (a[middle] >= a[0] && a[middle] >= a[a.length - 1])
            m = a[middle];
        if (a[a.length - 1] >= a[0] && a[a.length - 1] >= a[middle])
            m = a[a.length - 1];
        return m;
    }
}

