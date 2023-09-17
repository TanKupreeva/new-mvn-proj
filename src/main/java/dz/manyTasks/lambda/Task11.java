package dz.manyTasks.lambda;

import java.util.Arrays;
import java.util.List;

public class Task11 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(14, 26, 38, 4, 66, 777, 23);
        Search searchMax = integers -> {
            int max = integers.get(0);
            for (Integer integer : integers) {
                if (max < integer) max = integer;
            }
            return max;
        };
        System.out.println(searchMax.find(list));
        Search searchMin = integers -> {
            int min = integers.get(0);
            for (Integer integer : integers) {
                if (min > integer) min = integer;
            }
            return min;
        };
        System.out.println(searchMin.find(list));

    }
}

@FunctionalInterface
interface Search {
    int find(List<Integer> integers);
}