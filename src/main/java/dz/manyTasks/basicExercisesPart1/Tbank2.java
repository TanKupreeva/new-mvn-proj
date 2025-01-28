package dz.manyTasks.basicExercisesPart1;

import java.util.Scanner;

public class Tbank2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = (int)Math.ceil(Math.log(n) / Math.log(2));
        System.out.println(x);
    }
}
