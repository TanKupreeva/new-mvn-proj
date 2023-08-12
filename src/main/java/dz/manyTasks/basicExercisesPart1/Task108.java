package dz.manyTasks.basicExercisesPart1;

import java.util.Scanner;

public class Task108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input integer number");
        int x = sc.nextInt();
        int remainder = 0;
        int sum = 100;
        while (sum / 10 != 0) {
            sum = 0;
            while (x != 0) {
                remainder = x % 10;
                sum = remainder + sum;
                x = x / 10;
            }
            x = sum;
        }
        System.out.println(sum);
    }
}
