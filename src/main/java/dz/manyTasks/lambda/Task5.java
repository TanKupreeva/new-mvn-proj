package dz.manyTasks.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("hello", "java", "bye"));
        System.out.println(list);
        list.sort((str1, str2) -> str1.compareToIgnoreCase(str2));
        list.forEach(s -> System.out.println(s));
    }


}
