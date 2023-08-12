package dz.manyTasks.basicExercisesPart1;


import java.util.Scanner;

public class Task55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input seconds");
        long sec = sc.nextLong();
        long min = sec / 60;
        sec = sec - min * 60;
        long h = min / 60;
        min = min - h * 60;
        System.out.println(h + ":" + min + ":" + sec);
    }
}
