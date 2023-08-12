package dz.manyTasks.basicExercisesPart1;

import java.util.Arrays;

public class Task79 {
    public static void main(String[] args) {
        int[] a = {20, 30, 40};
        int[] b = {a[1], a[2], a[0]};
        System.out.println("Original array:" + Arrays.toString(a));
        System.out.println("Rotated array:" + Arrays.toString(b));
    }
}
