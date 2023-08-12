package dz.manyTasks.basicExercisesPart1;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        Scanner sc = new Scanner(System.in);
        System.out.println("Input BIN number");
        long bin = sc.nextLong();
        String otv = "";

        while (bin != 0) {
            int v = 0;
            for (int i = 0; i < 4; i++) {
                v = (int) (bin % 10 * Math.pow(2, i) + v);
                bin = bin / 10;
            }
            otv = hex[v] + otv;
        }
        System.out.println("HEX number is " + otv);
    }
}
