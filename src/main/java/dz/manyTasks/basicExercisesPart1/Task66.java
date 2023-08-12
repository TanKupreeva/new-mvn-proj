package dz.manyTasks.basicExercisesPart1;

public class Task66 {
    public static void main(String[] args) {
        int sum = 0;

        for (int j = 1; j <= 100; j++) {

            for (int i = 1; i <= (int) Math.sqrt(j); i++) {
                if (j % i != 0 && i != j) {
                    sum = sum + j;
                }
            }
        }
        System.out.println(sum);
    }
}
