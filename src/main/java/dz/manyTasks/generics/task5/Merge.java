package dz.manyTasks.generics.task5;

import java.util.Arrays;

public class Merge {
    public static <T> T[] merge(T[] a, T[] b) {
        T[] c = (T[]) new Object[a.length + b.length];
        for (int i = 0, j = 0; i < c.length - 1; i += 2) {
            c[i] = a[j];
            c[i + 1] = b[j];
            j++;
        }
        return c;
    }

    public static void main(String[] args) {
        Integer[] x = {1, 2, 3, 4, 5, 6, 7};
        Integer[] y = {0, 0, 0, 0, 0, 0, 0};
        System.out.println(Arrays.toString(merge(x, y)));
        String[] str1 = {"a", "b", "c"};
        String[] str2 = {"A", "B", "C"};
        System.out.println(Arrays.toString(merge(str1, str2)));
    }
}
