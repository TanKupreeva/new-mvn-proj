package dz.manyTasks.basicExercisesPart1;

import java.util.Arrays;

public class Task105 {
    public static void main(String[] args) {
        int[] a = {11, 15, 13, 10, 45, 20, 11, 15};
        System.out.println(Arrays.toString(a));
        int l = 2;
        int result = 0;
        int start = 0;
        int end = a.length - l;
        for (; l > 0; l--)
            if (a[start] != a[end]) {
                System.out.println(result = 1);
            } else {
                start++;
                end++;
            }
        if (result == 0) {
            System.out.println(true);
        } else System.out.println(false);
    }
}
