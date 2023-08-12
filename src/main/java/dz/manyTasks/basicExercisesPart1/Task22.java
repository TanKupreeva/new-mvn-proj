package dz.manyTasks.basicExercisesPart1;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input BIN number");
        long bin = sc.nextLong();
        int dec = 0;
        int i = 0;
        while (bin != 0) {
            dec = (int) (bin % 10 * Math.pow(2, i)) + dec;
            bin = bin / 10;
            i++;
        }
        System.out.println("DEC number is " + dec);
    }
}
