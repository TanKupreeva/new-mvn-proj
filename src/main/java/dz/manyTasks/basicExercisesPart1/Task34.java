package dz.manyTasks.basicExercisesPart1;

import java.util.Scanner;

public class Task34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the length of a side of the hexagon:");
        double a = sc.nextDouble();
        double s = 6 * a * a / (4 * Math.tan(Math.PI / 6));
        System.out.println("Area the hexagon is " + s);
    }
}
