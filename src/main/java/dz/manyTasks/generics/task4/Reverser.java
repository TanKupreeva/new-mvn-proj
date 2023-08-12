package dz.manyTasks.generics.task4;

import java.util.Arrays;

public class Reverser {
    public static <T> T[] reverse(T[] array) {
        T[] arr = (T[]) new Object [array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[array.length - 1 - i];

        }
        return arr;
    }

    public static void main(String[] args) {
        Integer[] a1 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(reverse(a1)));
        String[]a2= {"one", "two","three","four","five"};
        System.out.println(Arrays.toString(reverse(a2)));
    }
}
