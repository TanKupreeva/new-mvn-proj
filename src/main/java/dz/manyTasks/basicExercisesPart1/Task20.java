package dz.manyTasks.basicExercisesPart1;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        Scanner sc = new Scanner(System.in);
        System.out.println("Innput DEC number");
        int dec = sc.nextInt();
        String x = "";

        while (dec != 0) {
            int remainer = dec % 16;
            dec = dec / 16;
            x = hex[remainer] + x;

        }
        System.out.println("HEX number is " + x);
    }
}
