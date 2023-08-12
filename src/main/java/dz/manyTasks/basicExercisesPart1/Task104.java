package dz.manyTasks.basicExercisesPart1;

import java.util.Arrays;

public class Task104 {
    public static void main(String[] args) {
        int[] a = {11, 15, 13, 10, 45, 20, 33, 53};
        int k = 0;
        int x = 10;
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            if (a[a.length - 1 - i] == x) {
                k = a.length - 1 - i;
            }
        }
        int[] b = new int[k];
        for (int i=0;i<b.length;i++){
           b[i]=a[i];
        }
        System.out.println(Arrays.toString(b));
    }
}
