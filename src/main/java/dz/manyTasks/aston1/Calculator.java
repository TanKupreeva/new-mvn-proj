package dz.manyTasks.aston1;

public  final class Calculator {

    private Calculator() {
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static double division(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Деление на ноль запрещено!!");
        }
        return (double) a / b;
    }
}
