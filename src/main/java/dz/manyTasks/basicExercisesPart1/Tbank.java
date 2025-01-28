package dz.manyTasks.basicExercisesPart1;

import java.util.Scanner;


public class Tbank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);
        int d = Integer.parseInt(s[3]);
        if(d>b)System.out.println((d-b)*c+a);
        else System.out.println(100);


    }
}
