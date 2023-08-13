package dz.manyTasks.regular.task16;

public class Task16 {
    public static void main(String[] args) {
        String text = "LOWERED";
        System.out.println("Original string: " + text);
        System.out.println("After replacing vowel(s) with specified Character: " + validate(text, '#'));
        text = "Java";
        System.out.println("\nOriginal string: " + text);
        System.out.println("After replacing vowel(s) with specified Character: " + validate(text, '*'));
        text = "MID-CENTRALIZED";
        System.out.println("\nOriginal string: " + text);
        System.out.println("After replacing vowel(s) with specified Character: " + validate(text, '^'));
        text = "C++";
        System.out.println("\nOriginal string: " + text);
        System.out.println("After replacing vowel(s) with specified Character: " + validate(text, '@'));
    }

    public static String validate(String str, char s) {
        return str.replaceAll("(?i)[aeuioy]", "" + s);
    }
}
