package dz.manyTasks.basicExercisesPart1;

import java.util.Scanner;

public class Task11 {
    public static double area(double r) {

        double s = Math.PI * Math.pow(r, 2);
        return s;
    }


    public static double perimeter(double r) {

        double p = 2*Math.PI * r;
        return p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input radius of a circle.");
        double r = sc.nextDouble();
        System.out.println(r);
        System.out.println("Area circle is " + area(r));
        System.out.println("Perimeter circle is " + perimeter(r));

    }
}
