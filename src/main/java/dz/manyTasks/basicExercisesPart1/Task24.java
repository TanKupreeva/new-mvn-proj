package dz.manyTasks.basicExercisesPart1;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input BIN number");
        long bin = sc.nextLong();
        System.out.println("OCT number is " + oCt(bin));

    }

    public static int oCt(long bin) {
        int oct = 0;
        int j = 0;
        while (bin != 0) {
            int v = 0;
            for (int i = 0; i < 3; i++) {
                v = (int) (bin % 10 * Math.pow(2, i)) + v;
                bin = bin / 10;
            }
            oct = (int) (v * Math.pow(10, j)) + oct;
            j++;
        }
        return oct;

    }
}