package dz.manyTasks.basicExercisesPart1;

import java.util.Scanner;

public class Task17 {

    public static long sumBin(long a, long b) {
        int i = 0, remainder = 0;
        int[] sum = new int[20];
        while (a != 0 || b != 0) {
            sum[i] = (int) ((a % 10 + b % 10 + remainder) % 2);
            remainder = (int) ((a % 10 + b % 10 + remainder) / 2);
            i++;
            a = a / 10;
            b = b / 10;
        }
        if (remainder != 0) {
            sum[i] = remainder;
        } else {
            i--;
        }
        long otvet = 0;
        while (i >= 0) {
            otvet = (int) Math.pow(10, i) * sum[i] + otvet;
            i--;
        }
        return otvet;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first binary number");
        long a = sc.nextLong();
        System.out.println("Input second binary number");
        long b = sc.nextLong();
        System.out.println("Sum of two binary numbers: "+ sumBin(a, b));

    }

}

