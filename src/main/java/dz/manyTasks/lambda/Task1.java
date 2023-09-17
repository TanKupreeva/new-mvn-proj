package dz.manyTasks.lambda;

public class Task1 {

    public static void main(String[] args) {
        TwoInteger ti = (a, b) -> (a + b);
        System.out.println("4 + 6 = "+ti.sum(4,6));
        System.out.println("8 + 6 = "+ti.sum(8,6));
    }
}

interface TwoInteger {
    int sum(int a, int b);
}