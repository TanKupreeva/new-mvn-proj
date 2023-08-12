package dz.manyTasks.regular.task13;

public class Task13 {
    public static void main(String[] args) {
        String text = "python";
        System.out.println("Original string: " + text);
        System.out.println("New string: " + validate(text));
        text = "JavaScript";
        System.out.println("\nOriginal string: " + text);
        System.out.println("New string: " + validate(text));
        text = "PYTHON";
        System.out.println("\nOriginal string: " + text);
        System.out.println("New string: " + validate(text));
    }

    public static String validate(String str) {
        String str2 = str.toLowerCase();
        if (str2.contains("python"))
            return "java";
        else return "c++";

    }
}

