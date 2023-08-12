package dz.manyTasks.basicExercisesPart1;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input OCT number");
        int oct = sc.nextInt();
        long bin = 0;
        int i = 0;
        while (oct != 0) {
            int x = (int) oct % 10;
            while (x != 0) {
                bin = (int) (x % 2 * Math.pow(10, i)) + bin;
                x = x / 2;
                i++;
            }
            oct = oct / 10;
        }
        System.out.println("BIN number is " + bin);

    }
}
