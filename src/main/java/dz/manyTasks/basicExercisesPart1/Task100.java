package dz.manyTasks.basicExercisesPart1;

import java.util.Arrays;

public class Task100 {
    public static void main(String[] args) {
        int [] a1 ={10, 11, 10, 20, 43, 20, 50};
        int [] a2 = {10, 13, 11, 20, 44, 30, 50};
        int counter = 0;
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        for (int i = 0;i< a1.length;i++){
            if(Math.abs(a1[i]-a2[i])==1){
                counter++;
            }
        }
        System.out.println("Number of elements "+counter);
        }
    }

