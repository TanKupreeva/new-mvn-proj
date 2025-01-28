package dz.manyTasks.basicExercisesPart1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n;
        if (t == 1) {
            n = 1;
        } else n = 4 + 4 * (t - 1 - 1);
        System.out.println(n);
    }
}
