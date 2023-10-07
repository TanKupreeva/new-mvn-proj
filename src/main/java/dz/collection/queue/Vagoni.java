package dz.collection.queue;

import java.util.*;

public class Vagoni {
    public static void main(String[] args) {
        Queue<Integer> vagoniLine1 = new LinkedList<>();
        Stack<Integer> vagoniTupik = new Stack<>();
        Stack<Integer> vagoniLine2 = new Stack<>();

        System.out.println("Input quantity of the railway carriages");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nn = n;
        System.out.println("Input nubmers [1..." + n + "] ");
        while (n > 0) {
            int x = sc.nextInt();
            vagoniLine1.add(x);
            n--;
        }
        System.out.println("Line1 " + vagoniLine1);
        int i = 0;
        int counter;
        while (i++ < nn) {
            if (vagoniLine1.contains(i)) {
                counter = 0;
                while (vagoniLine1.peek() != i) {
                    vagoniTupik.push(vagoniLine1.peek());
                    counter++;
                    vagoniLine1.poll();
                }
                vagoniTupik.push(vagoniLine1.peek());
                vagoniLine1.poll();
                counter++;
                System.out.println("1 " + counter);
            }
            if (vagoniTupik.peek() == i) {
                counter = 0;
                vagoniLine2.push(vagoniTupik.peek());
                vagoniTupik.pop();
                counter++;
                System.out.println("2 " + counter);
            } else {
                System.out.println("net reshenii");
                return;
            }
        }
//        System.out.println(vagoniLine1);
//        System.out.println(vagoniTupik);
        System.out.println("Line2 " + vagoniLine2);
    }
}



