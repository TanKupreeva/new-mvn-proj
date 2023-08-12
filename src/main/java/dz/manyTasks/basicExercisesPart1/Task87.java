package dz.manyTasks.basicExercisesPart1;

import java.util.Arrays;
import java.util.Scanner;

public class Task87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input integer number");
        int n = sc.nextInt();
        String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        int sum = 0;
        int k = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        int sum1 = sum;

        while (sum1 != 0) {
            sum1 = sum1 / 10;
            k++;
        }
        String[] num = new String[k];

        while (sum != 0) {

            num[k - 1] = str[sum % 10];
            sum = sum / 10;
            k--;
        }
        System.out.println(Arrays.toString(num));
    }


}
