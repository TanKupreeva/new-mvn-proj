package dz.manyTasks.lambda;

import java.util.Arrays;
import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        List<Double> list = Arrays.asList(7.7, 8.8, 9.9, 5.5);
        Calcul sred = doubles -> {
            double summa = 0;
            double res = 0;
            for (Double d : doubles) {
                summa = summa + d;
            }
            res = summa / doubles.size();
            System.out.println(res);
        };
        sred.srednee(list);
    }
}

@FunctionalInterface
interface Calcul {
    void srednee(List<Double> doubles);
}