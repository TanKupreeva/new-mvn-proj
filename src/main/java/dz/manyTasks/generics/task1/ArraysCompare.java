package dz.manyTasks.generics.task1;

import java.util.Arrays;

public class ArraysCompare {
    public static <T> boolean compare(T[] arr1, T[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        Integer[] integers1 = {1, 2, 3, 4, 5};
        Integer[] integers2 = {1, 2, 3, 4, 5};
        Integer[] integers3 = {1, 2, 3, 45};
        String[] strings1 = {"I", "love", "you"};
        String[] strings2 = {"I", "love", "I"};
        String[] strings3 = {"I", "love", "you"};

        System.out.println("integers1: " + Arrays.toString(integers1));
        System.out.println("integers2: " + Arrays.toString(integers2));
        System.out.println("integers3: " + Arrays.toString(integers3));
        System.out.println("strings1: " + Arrays.toString(strings1));
        System.out.println("strings2: " + Arrays.toString(strings2));
        System.out.println("strings3: " + Arrays.toString(strings3));

        System.out.println("Compare integers1 & integers2 is " + compare(integers1, integers2));
        System.out.println("Compare integers1 & integers3 is " + compare(integers1, integers3));

        System.out.println("Compare integers2 & integers3 is " + compare(integers2, integers3));
        System.out.println("Compare strings1 & strings2 is " + compare(strings1, strings2));
        System.out.println("Compare strings2 & strings3 is " + compare(strings2, strings3));

        System.out.println("Compare strings1 & strings3 is " + compare(strings1, strings3));


    }

}
