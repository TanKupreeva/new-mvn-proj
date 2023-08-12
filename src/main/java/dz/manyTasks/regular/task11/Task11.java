package dz.manyTasks.regular.task11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task11 {
    public static void main(String[] args) {
        System.out.println(validate("abcdef"));
        System.out.println(validate("3abcd9f"));
        System.out.println(validate("abcdef9"));
        System.out.println(validate("abcdef3459"));
    }

    public static boolean validate(String str) {
        Pattern p = Pattern.compile("[0-9]$");
        Matcher m = p.matcher(str);

        if (m.find()) return true;
        else return false;
    }
}
