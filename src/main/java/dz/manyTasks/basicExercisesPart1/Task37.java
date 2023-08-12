package dz.manyTasks.basicExercisesPart1;

import java.util.Scanner;

public class Task37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a string");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());

    }
}
