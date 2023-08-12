package dz.manyTasks.basicExercisesPart1;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input OCT number");
        int oct = sc.nextInt();
        int dec = 0;
        int i = 0;
        while (oct != 0) {
            dec = (int) (oct % 10 * Math.pow(8, i)) + dec;
            oct = oct / 10;
            i++;
        }
        System.out.println("DEX number is " + dec);
    }
}
