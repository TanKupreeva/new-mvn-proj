package dz.manyTasks.basicExercisesPart1;

import java.math.BigDecimal;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int an = sc.nextInt();
        int n = (an - 99);
        BigDecimal nn = BigDecimal.valueOf(n);
        BigDecimal s = new BigDecimal((100 * 0.5 + an * 0.5));
        BigDecimal result = nn.multiply(s).setScale(0);
        System.out.println(result);

    }
}
