package dz.collection.queue;

import java.util.*;

public class ColodaKart {
    public static void main(String[] args) {
        Queue<Integer> player1 = new LinkedList<>();
        Queue<Integer> player2 = new LinkedList<>();

//тусуем карты
        Set<Integer> coloda = new LinkedHashSet<>();
        while (coloda.size() < 10) {
            int x = (int) (Math.random() * 10);
            coloda.add(x);
        }
        System.out.println(coloda);
//раздаем коллоду
        Iterator<Integer> iter = coloda.iterator();
        while (iter.hasNext()) {
            int x = iter.next();
            player1.add(x);
            x = iter.next();
            player2.add(x);
        }

        System.out.println(player1);
        System.out.println(player2);
//игра началась
        int count = 0;
        while (!player1.isEmpty() && !player2.isEmpty()) {
            count++;
            int a = player1.peek();
            int b = player2.peek();
            if (a > b && (a != 9 && b != 0)) {
                player1.offer(a);
                player1.offer(b);
                player1.poll();
                player2.poll();

                System.out.println("Play1" + player1);
                System.out.println("Play2" + player2);
            } else {
                player2.offer(b);
                player2.offer(a);
                player1.poll();
                player2.poll();
                System.out.println("Play1" + player1);
                System.out.println("Play2" + player2);
            }


        }
        if (player1.isEmpty()) System.out.println("second is WIN");
        else System.out.println("first is WIN");
        System.out.println("number of step is " + count);
        if (count > 1000000) System.out.println("botva");
    }
}
