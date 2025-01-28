package dz.manyTasks.basicExercisesPart1;


import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[][] array = new int[k][k];
        int i = 0;

        while (i < k) {
            Scanner sc2 = new Scanner(System.in);

            String str = sc2.nextLine();
            String[] s = str.split(" ");
            for (int j = 0; j < k; j++) {
                array[i][j] = Integer.parseInt(s[j]);
            }
            i++;
        }


        int[] sumStrok = new int[k];
        int[] sumStolbcov = new int[k];

        for (int x = 0; x < k; x++) {
            int sum = 0;
            for (int j = 0; j < k; j++) {
                sum = sum + array[x][j];
            }
            sumStrok[x] = sum;

        }

        for (int j = 0; j < k; j++) {
            int sum = 0;
            for (int x = 0; x < k; x++) {
                sum = sum + array[x][j];
            }
            sumStolbcov[j] = sum;

        }
        int count = 0;
        for (int x = 0; x < k; x++) {
            for (int j = 0; j < k; j++) {
                if (array[x][j] >= Math.abs(sumStrok[x] - sumStolbcov[j]) ){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
