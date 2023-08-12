package dz.manyTasks.basicExercisesPart1;

public class Task78 {
    public static boolean s(int[] a) {
        boolean f = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 4 || a[i] == 7) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] x = {5, 7};
        System.out.println(s(x));
    }
}
