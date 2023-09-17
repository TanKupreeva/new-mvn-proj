package dz.manyTasks.lambda;

public class Task8 {
    public static void main(String[] args) {
        Calc f = n -> {
            long result = 1;
            for (long i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };
        System.out.println(f.factorial(4));
        System.out.println(f.factorial(19));
    }
}

@FunctionalInterface
interface Calc {
    long factorial(int a);
}