package dz.manyTasks.string.task17;

import java.util.Arrays;

public class Task17 {
    public static void main(String[] args) {
        String str = "This is a sample string.";
//        char[] array = str.toCharArray();
//        System.out.println(Arrays.toString(array));

        char[] arr = {'a','b','c','d','e','f','g','i','j','k'};
        str.getChars(4, 9, arr, 2);
        System.out.println(Arrays.toString(arr));
    }
}
