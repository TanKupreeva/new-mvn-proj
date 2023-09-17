package dz.manyTasks.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> list =  Arrays.asList("One","Two","three","FOUR");
        System.out.println(list);
        list.forEach(s-> System.out.print(s.toLowerCase()+" "));
        System.out.println();
        list.forEach(s-> System.out.print(s.toUpperCase()+" "));
    }
}
