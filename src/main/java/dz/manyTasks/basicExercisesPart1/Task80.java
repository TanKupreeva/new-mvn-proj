package dz.manyTasks.basicExercisesPart1;

import java.util.Arrays;

public class Task80 {
    public static void main(String[] args) {
        int[] a = {20, 30, 40};
        System.out.println(Arrays.toString(a));
        if (a[0] > a[a.length - 1]) System.out.println("Larger value between first and last element: " + a[0]);
        else System.out.println("Larger value between first and last element: " + a[a.length - 1]);
    }
}
