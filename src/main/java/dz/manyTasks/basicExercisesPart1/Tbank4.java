package dz.manyTasks.basicExercisesPart1;


import java.util.Scanner;

public class Tbank4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split(" ");
        int n = Integer.parseInt(s[0]);
        int k = Integer.parseInt(s[1]);
        String str2 = sc.nextLine();
        String[] s2 = str2.split(" ");
        int[] array = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(s2[i]);
            if (array[i] > max) {
                max = array[i];
            }
        }

        int count = 0;
        while (max > 0) {
            max = max / 10;
            count++;
        }

        int[][] arr = new int[n][count];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < count; j++) {
                arr[i][j] = 9;
            }

        }


        for (int i = 0; i < n; i++) {
            int p = count - 1;
            for (int j = 0; j < count; j++) {

                if (((int) (array[i] / Math.pow(10, p)) != 0) || (array[i] == 0)) {
                    arr[i][j] = (int) (array[i] / Math.pow(10, p) - (int) (array[i] / Math.pow(10, p + 1)) * (int) (Math.pow(10, 1)));
                }
                p--;

            }

        }


        int ruznost = 0;
        int h = 0;
        int j = 0;
        while (k > 0) {

            if (h == 9 && j < arr[0].length) {
                j++;
                h = 0;
                count--;
            }


            for (int i = 0; i < arr.length; i++) {
                if (arr[i][j] == h) {
                    if (k == 0) break;
                    else {
                        ruznost = ruznost + (9 - h) * (int) (Math.pow(10, count - 1));
                        k = k - 1;
                    }
                }

            }
            h++;
            if (h == 9 && j == arr[0].length - 1) break;
        }
        System.out.println(ruznost);
    }
}
