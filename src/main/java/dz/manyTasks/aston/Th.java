package dz.manyTasks.aston;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Th {


    public static void main(String[] args) {
        List<String> words = Arrays.asList("k", "kk");
        long count = words.stream()
                .filter(w -> w.length() > 1)
                .count();

        System.out.println(count);


        List<String> list = Arrays.asList("a", "b", "c");

        boolean isExist = list.stream().anyMatch(element -> element.contains("a"));

            List <? extends Number> l = new ArrayList<Integer>();

    }
}
