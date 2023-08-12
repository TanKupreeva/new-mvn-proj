package dz.manyTasks.basicExercisesPart1;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number");
        int a = sc.nextInt();
        System.out.println("Input second number");
        int b = sc.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("Input first number " + a);
        System.out.println("Input second number " + b);


    }
}
