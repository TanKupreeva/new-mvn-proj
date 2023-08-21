package dz.manyTasks.string.task6;

import java.util.Locale;

public class Task6 {
    public static void main(String[] args) {
        String str1 = "This is exercise 1";
        String str2 = "This is Exercise 1";
        int x = str1.toLowerCase().compareTo(str2.toLowerCase());
        if (x == 0)
            System.out.printf("%s == %s", str1, str2);
        else System.out.printf("%s != %s", str1, str2);
    }
}
