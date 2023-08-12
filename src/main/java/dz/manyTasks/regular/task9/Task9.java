package dz.manyTasks.regular.task9;

import dz.manyTasks.generics.task7.Print_map;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task9 {
    public static void main(String[] args) {
        System.out.println(validate("5-2345861"));
        System.out.println(validate("6-2345861"));
        System.out.println(validate("6-5555861"));
    }

    public static boolean validate(String str) {
        Pattern p = Pattern.compile("^5.*$");
        Matcher m = p.matcher(str);
        if (m.find()) return true;
        else return false;
    }
}
