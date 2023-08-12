package dz.manyTasks.basicExercisesPart1;

import java.util.Scanner;

public class Task12 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number(n) you want to calculate the average: ");
        int n = sc.nextInt();
        double sum = 0;
        double[] numbers = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Input " + (i + 1) + " number");
            numbers[i] = sc.nextDouble();
            sum = sum + numbers[i];
        }
        double aver = sum / n;
        System.out.println("The average of the numbers is " + aver);
    }
}
