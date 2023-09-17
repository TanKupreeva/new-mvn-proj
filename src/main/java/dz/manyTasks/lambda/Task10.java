package dz.manyTasks.lambda;

import java.util.Arrays;
import java.util.List;

public class Task10 {
    public static void main(String[] args) {
        String str1= "Hello";
        String str2= "World";
        Concat concat =(s1,s2)-> System.out.println(s1+s2);
        concat.skleivanie(str1,str2);
    }
}

@FunctionalInterface
interface Concat {
    void skleivanie(String s1, String s2);
}