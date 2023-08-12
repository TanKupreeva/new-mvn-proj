package dz.manyTasks.basicExercisesPart1;

import java.util.Scanner;

public class Task72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a string");
        String str = sc.nextLine();
        if (str.length() >= 3) {
            System.out.println(str.substring(0, 3));
        } else if (str.length() == 1) {
            System.out.println(str.charAt(0) + "##");
        } else if (str.length() == 2) {
            System.out.println(str.substring(0, 2) + "#");
        } else System.out.println("###");
    }
}


