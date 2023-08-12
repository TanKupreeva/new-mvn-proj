package dz.manyTasks.basicExercisesPart1;

import java.util.Scanner;

public class Task62 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the first number : ");
        int a = in.nextInt();
        System.out.println("Input the second number: ");
        int b = in.nextInt();
        System.out.println("Input the third number : ");
        int c = in.nextInt();
        System.out.println(Math.abs(a - b) >= 20 || Math.abs(a - c) >= 20 || Math.abs(b - c) >= 20);
    }

}
