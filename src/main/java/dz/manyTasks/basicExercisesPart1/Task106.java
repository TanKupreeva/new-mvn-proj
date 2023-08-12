package dz.manyTasks.basicExercisesPart1;

import java.util.Arrays;

public class Task106 {
    public static void main(String[] args) {
        int[] a = {11, 15, 13, 10, 45, 20};
        int k = 3;
        int x = 0;
        System.out.println(Arrays.toString(a));
        for (; k > 0; k--) {
            int i = 0;
            x = a[i];
            for (int j = 0; j < a.length - 1; j++) {
                a[j] = a[j + 1];
            }
            a[a.length - 1] = x;
        }
        System.out.println(Arrays.toString(a));
    }
}
