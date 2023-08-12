package dz.manyTasks.basicExercisesPart1;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input HEX mumber");
        String h = sc.next();
        String hex = "0123456789ABCDEF";
        int dec = 0;
        int[] result = new int[20];

        char[] m = h.toCharArray();
        for (int i = 0; i < m.length; i++) {
            result[i] = hex.indexOf(m[i]);
        }
        for (int i = 0; i < m.length; i++) {
            dec = result[m.length - 1 - i] * (int) Math.pow(16, i) + dec;
        }
        System.out.println(dec);
    }
}
