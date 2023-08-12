package dz.manyTasks.basicExercisesPart1;

import java.util.Arrays;

public class Task92 {
    public static void main(String[] args) {
        int even = 0;
        int odd = 0;
        int[] a = {10, 32, 4, 5, 67, 8};
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                even++;
            } else odd++;
        }
        System.out.println(Arrays.toString(a));
        System.out.println("Number of even: " + even);
        System.out.println("Number of odd: " + odd);

    }
}
