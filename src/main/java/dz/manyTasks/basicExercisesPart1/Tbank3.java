package dz.manyTasks.basicExercisesPart1;

import java.util.Scanner;

public class Tbank3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split(" ");
        int k = Integer.parseInt(s[0]);
        int t = Integer.parseInt(s[1]);
        String str2 = sc.nextLine();
        String[] s2 = str2.split(" ");
        int[] person = new int[k];
        for (int i = 0; i < k; i++) {
            person[i] = Integer.parseInt(s2[i]);
        }
        int firstBack = sc.nextInt();
        int count = 0;
        if (person[firstBack - 1] - person[0] >= t && person[k - 1] - person[firstBack - 1] >= t) {
            if (person[0] + person[firstBack - 2] < person[firstBack] + person[k - 1]) {
                count = person[firstBack - 1] - person[0] + (person[k - 1] - person[0]);
            }
            if (person[0] + person[firstBack - 2] > person[firstBack] + person[k - 1]) {
                count = person[k - 1] - person[firstBack - 1] + (person[k - 1] - person[0]);
            }
        } else {
            count = person[k - 1] - person[0];
        }

        System.out.println(count);
    }
}

