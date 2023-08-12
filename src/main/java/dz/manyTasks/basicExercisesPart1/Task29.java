package dz.manyTasks.basicExercisesPart1;

import java.util.Scanner;

public class Task29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input HEX mumber");
        String s = sc.next();
        System.out.println("BIN number is " + bin(s));
    }

    public static int bin(String h) {
        String hex = "0123456789ABCDEF";
        String binS = "";
        //HEX -> DEC
        char[] m = h.toCharArray();
        int[] dec = new int[m.length];
        for (int i = 0; i < m.length; i++) {
            dec[i] = hex.indexOf(m[i]);
        }
        //DEC -> BIN
        for (int i = 0; i < dec.length; i++) {
            int j = 0;
            int[] bin = {0, 0, 0, 0};
            while (dec[i] != 0) {
                bin[bin.length - 1 - j] = dec[i] % 2;
                dec[i] = dec[i] / 2;
                j++;
            }
            for (int k = 0; k < 4; k++) {
                binS = binS + bin[k];
            }
        }
        return Integer.parseInt(binS);
    }
}