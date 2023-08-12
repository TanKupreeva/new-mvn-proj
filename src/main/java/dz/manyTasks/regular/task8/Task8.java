package dz.manyTasks.regular.task8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task8 {
    public static void main(String[] args) {
        System.out.println(validate("The quick brown fox jumps over the lazy dog."));
        System.out.println(validate("Java_Exercises_1"));
        System.out.println(validate("Java_Exercises_11.0"));
        System.out.println(validate("w3r"));
    }

    public static String validate(String str) {
        Pattern p = Pattern.compile("\\w+");
        Matcher m = p.matcher(str);
        if (m.matches())return "Found a match!";
        else return "Not matched!";

    }
}
