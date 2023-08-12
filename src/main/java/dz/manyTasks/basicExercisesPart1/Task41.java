package dz.manyTasks.basicExercisesPart1;

import java.util.Scanner;

public class Task41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a character");
        char ch = sc.next().charAt(0);
        int number = (int) ch;
        System.out.println("The ASCII value of " + ch + " is " + number);

    }
}
