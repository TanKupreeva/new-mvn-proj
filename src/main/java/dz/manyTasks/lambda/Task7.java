package dz.manyTasks.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 1, 6, 7, 1, 7, 2, 2));
        Dublicate dublicate = integers -> {
            for (int i = 0; i < integers.size(); i++) {
                for (int j = 1; j < integers.size(); j++) {
                    if (integers.get(i) == integers.get(j))
                        integers.remove(j);
                }
            }
        };
        dublicate.delete(list);
        System.out.println(list);
    }
}

@FunctionalInterface
interface Dublicate {
    void delete(List<Integer> integers);
}