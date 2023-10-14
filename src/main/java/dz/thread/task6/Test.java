package dz.thread.task6;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("input number");
//        int x = sc.nextInt();
        Thread p = new Thread(new Thread1());
        p.start();

//        System.out.println(p.list);


    }
}
