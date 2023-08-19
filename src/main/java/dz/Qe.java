package dz;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Qe {
    public static void main(String[] args) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("input a");
        a = sc.nextDouble();
        System.out.println("input b");
        b = sc.nextDouble();
        System.out.println("input c");
        c = sc.nextDouble();
        double max = a, min = b;
        if (c >= b && c >= a) {
            max = c;
        }
        if (b >= a && b >= c) {
            max = b;
        }
        if (a <= b && a <= c) {
            min = a;
        }
        if (c <= a && c <= b) {
            min = c;
        }

        BigDecimal sred =new BigDecimal(a).add(BigDecimal.valueOf(b)).add(BigDecimal.valueOf(c)).
                subtract(BigDecimal.valueOf(min)).subtract(BigDecimal.valueOf(max));
        System.out.println(max);
        System.out.println(sred);
        System.out.println(min);

    }
}
