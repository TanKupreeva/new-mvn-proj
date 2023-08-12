package dz.manyTasks.regular.task12;

import dz.manyTasks.inheritance.task7.Person;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task12 {
    public static void main(String[] args) {
        String text = "Python is an interpreted high-level general-purpose programming language. " +
                "Its design philosophy emphasizes code readability with its use of significant indentation. " +
                "Its language constructs as well as its object-oriented approach aim to help programmers write" +
                "clear, logical code for small and large-scale projects.Python";
        System.out.println("Original string:");
        System.out.println(text);
        System.out.println("\nAfter replacing Python to Java and code to coding in the said string:");
        System.out.println(validate(text));
    }
public static String validate(String str){
    Pattern p = Pattern.compile("");
    Matcher m = p.matcher(str);
    return str.replaceAll("Python","Java").replace("code","coding");
}
}

