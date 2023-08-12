package dz.manyTasks.basicExercisesPart1;

import java.util.Arrays;

public class Task94 {
    public static void main(String[] args) {
        int[] a = {1, 7, 8, 5, 7, 13, 0, 2, 4, 9};
        System.out.println("Original Array: " + Arrays.toString(a));
        int i = 0;
        int j = 0;
        if (i < a.length) {
            while (a[i] % 2 != 0) {
                i++;
            }
            if (a[i] % 2 == 0) {
                int x = a[i];
                while (a[a.length - 1 - j] == 0) {
                    j++;
                }
                a[i] = a[a.length - 1 - j];
                a[a.length - 1 - j] = x;
            }
        }
        System.out.println("New Array: " + Arrays.toString(a));
    }
}

