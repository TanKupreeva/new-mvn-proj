package dz.manyTasks.generics.task2;

import java.util.Arrays;

public class EvenOddSumCalculator {
    public static <T extends Number> void calculate(T[] numbers) {
        double odd = 0;
        double even = 0;
        for (T anyNumber : numbers) {
            if (anyNumber.doubleValue() % 2 == 0) {
                even = even + anyNumber.doubleValue();
            } else odd = odd + anyNumber.doubleValue();
        }
        System.out.println("Array Is: " + Arrays.toString(numbers));
        System.out.println("Sum even is " + even);
        System.out.println("Sum odd is " + odd);
    }

    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Double[] doubles = {2.0, 1.2, 1.3, 1.4, 1.5};
        calculate(integers);
        calculate(doubles);
    }
}
