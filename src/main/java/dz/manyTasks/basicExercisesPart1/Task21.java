package dz.manyTasks.basicExercisesPart1;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Innput DEC number");
        int dec = sc.nextInt();
        int[] oct = new int[20];
        int i = 0;
        while (dec != 0) {
            int remainer = dec % 8;
            dec = dec / 8;
            oct[i] = remainer;
            i++;
        }
        int otvet = 0;
        while (i >= 0) {
            otvet = (int) Math.pow(10, i) * oct[i] + otvet;
            i--;
        }
        System.out.println("OCT number is " + otvet);
    }
}
