package dz.manyTasks.regular.task23;

public class Task23 {
    public static void main(String[] args) {
        String text = "JavajAvajaVajavA";
        System.out.println("Original String: " + text);
        System.out.println("Move all lower case letters to the front of the said word: " + validate(text));
        text = "JavaScript";
        System.out.println("\nOriginal String: " + text);
        System.out.println("Move all lower case letters to the front of the said word: " + validate(text));
        text = "SQLite";
        System.out.println("\nOriginal String: " + text);
        System.out.println("Move all lower case letters to the front of the said word: " + validate(text));
    }

    public static String validate(String str) {
        return str.replaceAll("[a-z]", "") + str.replaceAll("[A-Z]", "");
    }
}
