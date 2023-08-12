package dz.manyTasks.basicExercisesPart1;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Width of rectangle");
        double w = sc.nextDouble();
        System.out.println("Input Height of rectangle");
        double h = sc.nextDouble();
        System.out.println("Area is " + w * h);
        System.out.println("Perimeter is " + 2 * (w + h));
    }
}
