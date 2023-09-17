package dz.manyTasks.lambda;

import java.util.function.Predicate;

public class Task9 {
    public static void main(String[] args) {
        Predicate <Integer> pr = n->{
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };
        System.out.println(pr.test(45));
        System.out.println(pr.test(13));
    }
}
