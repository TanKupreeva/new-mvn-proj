package dz.manyTasks.basicExercisesPart1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number");
        try
        {int a = sc.nextInt();
        System.out.println("Input second number");
        int b = sc.nextInt();
        System.out.println(a + " * " + b + " = " + a * b);
    }
    catch (Exception e){
        System.out.println("Введите целое число");}
    }

}
