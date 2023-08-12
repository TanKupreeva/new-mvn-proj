package dz.manyTasks.basicExercisesPart1;

import java.util.Scanner;

public class Task35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of sides the polygon");
        int n = sc.nextInt();
        System.out.println("Input the length of a side of the polygon");
        double a = sc.nextDouble();
        double s = n * a * a / (4 * Math.tan(Math.PI / n));
        System.out.println("Area the polygon is " + s);
    }
}

