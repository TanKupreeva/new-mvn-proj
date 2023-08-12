package dz.manyTasks.basicExercisesPart1;

public class Task101 {
    public static void main(String[] args) {
        int[] a = {10, 11, 10, 30, 45, 20, 33, 53};
        int x = 10;
        int y = 20;
        int counX = 0;
        int counY = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                counX++;
            }
            if (a[i] == y) {
                counY++;
            }
        }
        if (counX > counY) {
            System.out.println(x + ">" + y);
        }

    }
}
