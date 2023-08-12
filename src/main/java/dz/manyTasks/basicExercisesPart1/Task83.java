package dz.manyTasks.basicExercisesPart1;

import java.util.Arrays;

public class Task83 {
    public static void main(String[] args) {
        int[] a1 = {1, 3, -5, 4};
        int[] a2 = {1, 4, -5, -2};
        int[] aa = new int[a1.length];
        for (int i = 0; i < aa.length; i++) {
            aa[i] = a1[i] * a2[i];
        }
        System.out.println("Array1: " + Arrays.toString(a1));
        System.out.println("Array2: " + Arrays.toString(a2));
        System.out.println("Result : " + Arrays.toString(aa));

    }
}
