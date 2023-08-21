package dz.manyTasks.string.task14;

public class Task14 {
    public static void main(String[] args) {
        String str1 = "Stephen Edwin King";
        String s1 = "Walter Winchell";
        String str2 = "Stephen Edwin King";
        String s2 = "stephen edwin king";
        System.out.println(str1.toLowerCase().equals(s1.toLowerCase()));
        System.out.println(str2.toLowerCase().equals(s2.toLowerCase()));

    }
}
