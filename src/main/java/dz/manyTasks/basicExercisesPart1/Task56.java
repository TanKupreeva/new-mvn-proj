package dz.manyTasks.basicExercisesPart1;

import java.util.Scanner;

public class Task56 {
    public static void main(String[] args) {
        int x = 5;
        int y = 20;
        int p = 3;
        System.out.println("The number of values in a given range divisible by a given value is  "+counter(x, y, p));
    }

    public static int counter(int a, int b, int n) {
        int c = 0;
        for (int i = a; i <= b; i++) {
            if (i % n == 0) {
                c++;
            }
        }
        return c;
    }
}
