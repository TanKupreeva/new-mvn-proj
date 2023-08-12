package dz.manyTasks.regular.task6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    public static void main(String[] args) {
        System.out.println(validate("The quick brown fox jumps over the lazy dog."));
        System.out.println(validate("Java Exercises."));
        System.out.println(validate("Do humans eat gizzards?"));
        System.out.println(validate("gizzards?"));
    }

    public static String validate(String str) {
        Pattern p = Pattern.compile(".*g+.*");
        Matcher m = p.matcher(str);
        if (m.find())
            return "Found a match!";
        else return "Not matched!";
    }
}
