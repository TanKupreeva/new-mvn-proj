package dz.manyTasks.basicExercisesPart1;

public class Task96 {
    public static void main(String[] args) {
        int[] a = {10, 70, 80, 50, 20, 13, 50};
        boolean t = false;
        int x = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 10) {
                t = true;
            }
            if (t && a[i] == 20) {
                System.out.println(true);
                x = 1;
            }
        }
        if (x == 0) System.out.println(false);

    }
}
