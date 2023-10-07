package dz.thread.task6;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input number");
        int x = sc.nextInt();
        Thread1 p = new Thread1();
        p.put(x);
        System.out.println(p.list);


    }
}
