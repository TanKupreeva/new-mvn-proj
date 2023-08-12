package dz.manyTasks.basicExercisesPart1;

public class Task97 {
    public static void main(String[] args) {
        int[] a = {7, 20, 6, 10, 20, 20, 10};
        int x = 10;
        boolean b = false;
        int k = 0;
        for (int i = 0; i < a.length-1 ; i++) {
            if (a[i] == x && a[i + 1] == x) {
                k = 1;
            }
            if ((i < a.length - 2) && a[i] == x && a[i + 2] == x) {
                k = 1;
            }
        }
        if (k == 0) {
            System.out.println(false);
        } else System.out.println(true);

    }
}
