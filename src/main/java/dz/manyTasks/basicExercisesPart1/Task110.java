package dz.manyTasks.basicExercisesPart1;

import java.util.Scanner;

public class Task110 {
    public static void main(String[] arg) {
        int test = 0;
        int k = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Input a positive integer: ");
        int x = in.nextInt();
        int xx = x;
        while (x != 1) {
            if (x % 4 == 0) {
                x = x / 4;
                k++;
            } else {test = 1;
            break;}
        }
        if (test == 0) System.out.println("4 ^ " + k + " = " + xx);
        if (test == 1) System.out.println(false);
    }
}
