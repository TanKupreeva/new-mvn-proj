package dz.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        while (true) {
            int[] m = {-1, 0, 1};
            Scanner sc = new Scanner(System.in);
            System.out.println("Input a number");
            try {
                int a = sc.nextInt();
                System.out.println("number = " + a);
                m[a] = 4 / a;
                System.out.println(m[a]);
            } catch (ArithmeticException e) {
                System.out.println("Деление на ноль!");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Please user next indexes bound -> from 1 to " + (m.length - 1));
            } catch (Exception e) {
                System.out.println("Input must be an integer");
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
                break;
            }


        }
    }
}
