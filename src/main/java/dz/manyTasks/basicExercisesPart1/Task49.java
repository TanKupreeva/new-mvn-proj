package dz.manyTasks.basicExercisesPart1;

import java.util.Scanner;

public class Task49 {
    public static void main(String[] args) {
        System.out.println("Input number");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        if (a % 2 == 0) {
            System.out.println(1);
        } else System.out.println(0);
    }
}
