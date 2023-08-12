package dz.manyTasks.basicExercisesPart1;

import java.util.Scanner;

public class Task57 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int x = in.nextInt();

        System.out.println(counter(x));
    }

    public static int counter(int num) {
        int n = 0;
        for (int i = 1; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0 && i * i != num) {
                n += 2;
            } else if (i * i == num) {
                n++;
            }
        }
        return n;


    }
}