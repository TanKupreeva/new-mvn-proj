package dz.manyTasks.basicExercisesPart1;

import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number ");
        int a = sc.nextInt();
        System.out.println("Input second number ");
        int b = sc.nextInt();
        if (a == b) {
            System.out.println(a + " = " + b);
        }
        if (a != b) {
            System.out.println(a + " != " + b);
        }
        if (a > b) {
            System.out.println(a + " > " + b);
        }
        if (a >= b) {
            System.out.println(a + " >= " + b);
        }
        if (a < b) {
            System.out.println(a + " < " + b);
        }
        if (a <= b) {
            System.out.println(a + " <= " + b);
        }
    }
}
