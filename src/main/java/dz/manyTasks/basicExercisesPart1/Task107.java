package dz.manyTasks.basicExercisesPart1;

public class Task107 {
    public static void main(String[] args) {
        int[] a = {10, 9, 13, 14, 15, 16};
        int k = 0;
        boolean b = false;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i + 1] == a[i] + 1) {
                k++;
            }
        }
        if (k >= 3) {
            b = true;

        }
        System.out.println(b);
    }
}
