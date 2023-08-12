package dz.manyTasks.basicExercisesPart1;

import java.util.Scanner;

public class Task19 {
    public static long bin(int x) {
        int[] num = new int[20];
        int i = 0;
        while (x != 0) {
            num[i] = x % 2;
            x = x / 2;
            i++;
        }
        long y = 0;
        i--;
        while (i >= 0) {
            y = num[i] * (int) Math.pow(10, i) + y;
        i--;
        }

        return y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input DEC number");
        int x = sc.nextInt();
        System.out.println("BIN number is " + bin(x));
    }
}
