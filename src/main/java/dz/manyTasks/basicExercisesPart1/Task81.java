package dz.manyTasks.basicExercisesPart1;

import java.util.Arrays;

public class Task81 {
    public static void main(String[] args) {
        int[] a = {20, 30, 40};
        int[] b = new int[a.length];
        b[0] = a[a.length - 1];
        b[b.length - 1] = a[0];
        for (int i = 1; i < b.length - 1; i++) {
            b[i] = a[i];
        }
        System.out.println("Original array: " + Arrays.toString(a));
        System.out.println("New array after swaping the first and last elements:y: " + Arrays.toString(b));

    }
}
