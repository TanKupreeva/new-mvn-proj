package dz.manyTasks.string.task5;

public class Task5 {
    public static void main(String[] args) {
        String str1 = "This is Exercise";
        String str2 = "This is Exercise 2";
        int i = str1.compareTo(str2);
        if (i > 0) {
            System.out.printf("%s > %s", str1, str2);
        }

        if (i == 0) {
            System.out.printf("%s == %s", str1, str2);
        }
        if (i < 0) {
            System.out.printf("%s < %s", str1, str2);
        }
    }
}
