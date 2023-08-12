package dz.manyTasks.basicExercisesPart1;

public class Task99 {
    public static void main(String[] args) {
        int[] a = {20, 20, 0, 20, 20};
        int result = 0;
        int x = 20;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != x && a[i + 1] != x) {
                result = 1;
            }
        }
        if (result == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
