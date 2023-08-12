package dz.manyTasks.basicExercisesPart1;

import java.util.Arrays;

public class Task93 {
    public static void main(String[] args) {
        int[] a = {10, 10, 89, 90, 20, 20, 4};
        boolean f10 = false;
        boolean f20 = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 10 && a[i + 1] == 10) {
                f10 = true;
            }
            if (a[i] == 20 && a[i + 1] == 20) {
                f20 = true;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(f10 != f20);

    }
}
