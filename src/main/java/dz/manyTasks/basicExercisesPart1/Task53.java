package dz.manyTasks.basicExercisesPart1;

import java.util.Scanner;

public class Task53 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the first number : ");
        int a = in.nextInt();
        System.out.println("Input the second number: ");
        int b = in.nextInt();
        System.out.println("Input the third number : ");
        int c = in.nextInt();
        System.out.println("The result is: " + test(a, b, c, true));
    }

    public static boolean test(int x, int y, int z, boolean abc) {
        if (abc)
            return (z > y);
        return (y > x && z > y);

    }
}

