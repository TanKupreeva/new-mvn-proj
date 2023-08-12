package dz.manyTasks.basicExercisesPart1;

import java.util.Scanner;

public class Task6 {

    public static int sum(int a, int b) {
        int c = a + b;
        return c;
    }

    public static int difference(int a, int b) {
        int c = a - b;
        return c;
    }

    public static int multiply(int a, int b) {
        int c = a * b;
        return c;
    }

    public static int devision(int a, int b) {
        int c = a / b;
        return c;
    }

    public static int mod(int a, int b) {
        int c = a % b;
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first int number");
        int a = sc.nextInt();
        System.out.println("Input second int number");
        int b = sc.nextInt();
        System.out.println(a + " + " + b + " = " + sum(a, b));
        System.out.println(a + " - " + b + " = " + difference(a, b));
        System.out.println(a + " * " + b + " = " + multiply(a, b));
        try {
            System.out.println(a + " / " + b + " = " + devision(a, b));

        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль запрещено");
        }

        try {
            System.out.println(a + " mod " + b + " = " + mod(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль запрещено");
        }


    }
}
