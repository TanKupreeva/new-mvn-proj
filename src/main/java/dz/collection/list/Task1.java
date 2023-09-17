package dz.collection.list;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            list.add((int) (Math.random() * 11 - 1) + 1);
        }
        System.out.println(list);
        System.out.print("[");
        for (int i = list.size() - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(list.get(i) + "]");
            } else
                System.out.print(list.get(i) + ", ");
        }

        Iterator<Integer> iterator = list.iterator();
        int max = list.get(0);
        int min = list.get(0);
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }

        System.out.println("\nmax = " + max);
        System.out.println("min = " + min);

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    list.remove(j);
                    j--;
                }
            }
        }
        System.out.println(list);
    }
}
