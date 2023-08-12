package dz.manyTasks.basicExercisesPart1;

import java.util.Arrays;

public class Task77 {
    public static void main(String[] args) {
        int[] a1 = {50, -20, 0};
        int[] a2 = {5, -50, 1};
        int[] a3 = new int[2];
        a3[0] = a1[0];
        a3[1] = a2[a2.length - 1];
        System.out.println("Array 1: " + Arrays.toString(a1));
        System.out.println("Array 2: " + Arrays.toString(a2));
        System.out.println("Array 3: " + Arrays.toString(a3));

    }
}
