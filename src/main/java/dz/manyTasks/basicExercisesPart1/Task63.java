package dz.manyTasks.basicExercisesPart1;

import java.util.Scanner;

public class Task63 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the first number : ");
        int x = in.nextInt();
        System.out.println("Input the second number: ");
        int y = in.nextInt();
        result(x, y);
    }

    public static void result(int a, int b) {
        if (a == b) {
            System.out.println(0);
        } else if (a % 6 == b % 6) {
            System.out.println("The smallest value is " + (a < b ? a : b));
        } else
            System.out.println("The largest value is " + (a > b ? a : b));
    }
}
