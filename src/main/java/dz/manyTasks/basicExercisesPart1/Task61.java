package dz.manyTasks.basicExercisesPart1;

import java.util.Scanner;

public class Task61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a word");
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
    }
}
