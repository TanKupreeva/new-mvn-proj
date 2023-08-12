package dz.manyTasks.basicExercisesPart1;


import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Input a = ");
            try {
                int a = sc.nextInt();
                System.out.println("Input b = ");
                int b = sc.nextInt();

                System.out.println("a / b = " + a + " / " + b + " = " + (a / b));
            } catch (ArithmeticException e) {
                System.out.println("Деление на ноль запрещено");
            } catch (Exception e) {
                System.out.println("Введено дробное число");
                String str = sc.next();
            }
            char o;
            do {
                System.out.println("Желаете продолжить? y/n");
                o = sc.next().charAt(0);
                System.out.println("otvet = " + o);
            }
            while (o != 'n' && o != 'y');

            if (o == 'n') {
                System.out.println("Goodbye");
                break;
            }
        }
    }
}


