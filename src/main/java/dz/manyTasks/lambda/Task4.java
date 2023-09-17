package dz.manyTasks.lambda;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 4, 5, 6, 7);
        Predicate<Integer> pr = i -> i % 2 == 0;
        list.forEach(s -> System.out.println(pr.test(s)));
    }
}
