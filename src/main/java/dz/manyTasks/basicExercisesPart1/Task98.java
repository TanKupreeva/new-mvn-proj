package dz.manyTasks.basicExercisesPart1;

public class Task98 {
    public static void main(String[] args) {
        int[] a = {10, 20, 20, 20, 40, 13, 20};
        int x = 20;
        int counter = 0;
        int resalt = 0;
        if (a[0] == x) {
            counter++;
        }
        for (int i = 1; i < a.length; i++) {
            if (a[i] == x && a[i - 1] == x) {
                resalt = 1;

            }
            if (a[i] == 20) {
                counter++;
            }
        }
        if (counter == 3 && resalt == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


    }
}
