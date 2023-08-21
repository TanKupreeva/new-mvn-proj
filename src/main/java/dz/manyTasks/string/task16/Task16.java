package dz.manyTasks.string.task16;

import java.util.Arrays;

public class Task16 {
    public static void main(String[] args) {
        String str = "The new String equals This is a sample String.";
//        char[] ch = str.toCharArray();
//        int[] array = new int[ch.length];
//        for (int i = 0; i < ch.length; i++) {
//            array[i] = (int) ch[i];
//        }
        byte[] array = str.getBytes();
        System.out.println(Arrays.toString(array));
    }
}
