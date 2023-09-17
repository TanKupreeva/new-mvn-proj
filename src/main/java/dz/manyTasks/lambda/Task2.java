package dz.manyTasks.lambda;

//public class Task2 {
//    public static void main(String[] args) {
//        Check ch = (str)->{return str.length()==0;};
//        System.out.println(ch.check(""));
//        System.out.println(ch.check("Hello"));
//
//
//    }
//}
//interface Check{
//    boolean check(String str);

import java.util.function.Predicate;

public class Task2 {
    public static void main(String[] args) {
        Predicate<String> pred1 = (str)-> str.isEmpty();
        System.out.println(pred1.test(""));
        System.out.println(pred1.test("Hello"));

    }
}