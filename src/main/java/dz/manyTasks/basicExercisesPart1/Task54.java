package dz.manyTasks.basicExercisesPart1;

import java.util.Scanner;

public class Task54 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the first number : ");
        int a = in.nextInt();
        System.out.println("Input the second number: ");
        int b = in.nextInt();
        System.out.println("Input the third number : ");
        int c = in.nextInt();
        System.out.println(test(a, b, c));
    }

    public static boolean test(int x, int y, int z) {
        if (x % 10 == y % 10 || x % 10 == z % 10 || y % 10 == z % 10) {
            return true;
        } else return false;
    }
}
