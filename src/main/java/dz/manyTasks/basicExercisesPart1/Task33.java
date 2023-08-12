package dz.manyTasks.basicExercisesPart1;

import java.util.Scanner;

public class Task33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input integer number");
        int a = sc.nextInt();
        int sum = 0;
        while (a != 0) {
            sum = a % 10 + sum;
            a = a / 10;
        }
        System.out.println("The sum of an integer's digits is  " + sum);
    }
}
