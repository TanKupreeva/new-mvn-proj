package dz.manyTasks.basicExercisesPart1;

import java.util.Arrays;

public class Task113 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {2, 5, 7, 8};
        int[] res = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            res[i] = a[i];
        }
        for (int i = a.length, j = 0; i < res.length; i++, j++) {
            res[i] = b[j];
        }
        Arrays.sort(res);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(res));

    }
}
