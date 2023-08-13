package dz.manyTasks.regular.task26;

public class Task26 {
    public static void main(String[] args) {
        String text = "123456";
        System.out.println("Original String: " + text);
        System.out.println("Check the said string is a valid hex code or not? " + validate(text));
        text = "#eaecff";
        System.out.println("\nOriginal String: " + text);
        System.out.println("Check the said string is a valid hex code or not? " + validate(text));
        text = "#FF0000";
        System.out.println("\nOriginal String: " + text);
        System.out.println("Check the said string is a valid hex code or not? " + validate(text));
        text = "#DD5C5C";
        System.out.println("\nOriginal String: " + text);
        System.out.println("Check the said string is a valid hex code or not? " + validate(text));
        text = "#0000000";
        System.out.println("\nOriginal String: " + text);
        System.out.println("Check the said string is a valid hex code or not? " + validate(text));
    }

    public static boolean validate(String str) {
        if (str.matches("#[a-fA-F0-9]{1,}")) return true;
        else return false;
    }
}
