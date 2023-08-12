package dz.manyTasks.basicExercisesPart1;

import java.util.Scanner;

public class Task52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number");
        int a = sc.nextInt();
        System.out.println("Input second number");
        int b = sc.nextInt();
        System.out.println("Input third number");
        int c = sc.nextInt();
        boolean flag = false;
        if ((a + b == c) || (c + b == a) || (a + c == b)) {
            flag = true;
        }
        System.out.println("The result is: " + flag);
    }
}
