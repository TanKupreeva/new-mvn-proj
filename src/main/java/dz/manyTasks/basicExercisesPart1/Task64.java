package dz.manyTasks.basicExercisesPart1;

import java.util.Scanner;

public class Task64 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the first integer number from the range [25;75]: ");
        int x = in.nextInt();
        System.out.println("Input the second integer number from the range [25;75]: ");
        int y = in.nextInt();
        System.out.println(result(x, y));
    }

    public static boolean result(int a, int b) {
        int aa = a / 10;
        int bb = b / 10;
        if (aa == bb || a % 10 == bb || a % 10 == b % 10 || b % 10 == aa)
            return true;
        else return false;
    }
}
