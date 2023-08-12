package dz.manyTasks.basicExercisesPart1;

import java.util.Scanner;

public class Task86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input integer number");
        int n = sc.nextInt();
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            }
            if (n % 2 != 0) {
                n = n /3 + 1;
            }
        }
        System.out.println(n);

    }
}
