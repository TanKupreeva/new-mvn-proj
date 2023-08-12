package dz.manyTasks.basicExercisesPart1;

import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input HEX mumber");
        String s = sc.next();
        int b = Task29.bin(s);
        int o = Task24.oCt(b);
        System.out.println(o);
    }
}
