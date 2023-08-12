package dz.manyTasks.basicExercisesPart1;

import java.util.Arrays;

public class Task102 {
    public static void main(String[] args) {
        int[] a = {11, 11, 13, 31, 45, 20, 33, 53};
        int x = 10;
        int y = 30;
        int result = 0;
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            if(a[i]==x||a[i]==y){
                result = 1;
            }
        }
        if(result==1){
            System.out.println(true);
        }else System.out.println(false);
    }
}
