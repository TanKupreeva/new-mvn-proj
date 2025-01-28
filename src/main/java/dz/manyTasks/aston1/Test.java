package dz.manyTasks.aston1;

import static dz.manyTasks.aston1.Calculator.*;

public class Test {
    public static void main(String[] args) {
        System.out.println(Calculator.sum(7, 9));
        System.out.println(sub(98, 9));
        System.out.println(multiplication(5, 5));
//        System.out.println(division(9, 0));
        System.out.println(division(8, 3));
        System.out.println(division(sub(sum(6, 9), multiplication(9, 0)), sum(9, 8)));

    }
}
