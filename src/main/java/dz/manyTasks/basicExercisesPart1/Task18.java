package dz.manyTasks.basicExercisesPart1;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first binary number");
        long a = sc.nextLong();
        System.out.println("Input second binary number");
        long b = sc.nextLong();

        int k = 1;
        int aa = (int) (b % 10 * a);
        b = b / 10;
        while (b != 0) {

            int bb = (int) (b % 10 * a) * (int) Math.pow(10, k);
            k++;
            aa = (int) Task17.sumBin(aa, bb);
            b = b / 10;
        }
        System.out.println("Multiply of two binary numbers: " + aa);

    }

}
