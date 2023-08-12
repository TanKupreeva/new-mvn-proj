package dz.manyTasks.regular.task17;

public class Task17 {
    public static void main(String[] args) {
        String n = "123";
        System.out.println("Original Number: " + n);
        System.out.println("Number of decimal places in the said number: " + validate(n));
        n = "112.3";
        System.out.println("\nOriginal Number: " + n);
        System.out.println("Number of decimal places in the said number: " + validate(n));
        n = "112.03";
        System.out.println("\nOriginal Number: " + n);
        System.out.println("Number of decimal places in the said number: " + validate(n));
        n = "112.233";
        System.out.println("\nOriginal Number: " + n);
        System.out.println("Number of decimal places in the said number: " + validate(n));
    }

    public static int validate(String str) {
        if(str.contains("."))
        return str.replaceAll("[0-9]+\\.", "").length();
        else return 0;
    }
}
