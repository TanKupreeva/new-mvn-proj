package dz.manyTasks.regular.task7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7 {
    public static void main(String[] args) {

        System.out.println(validate("The quick brown fox jumps over the lazy dog."));
        System.out.println(validate("Java Exercises."));
        System.out.println(validate("Programming Language"));
        System.out.println(validate("Do humans eat gizzards?"));
        System.out.println(validate("PostgreSQL"));
    }

    public static boolean validate(String str) {
        Pattern p = Pattern.compile("\\Bg\\B");
        Matcher m = p.matcher(str);
        if (m.find())
            return true;
        else return false;
    }
}
