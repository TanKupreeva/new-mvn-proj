package dz.manyTasks.regular.task20;

public class Task20 {
    public static void main(String[] args) {
        int n = 100;
        System.out.println("Original Number: " + n);
        System.out.println("Set thousands separator in the said number): " + validate(n));
        n = 1000;
        System.out.println("\nOriginal Number: " + n);
        System.out.println("Set thousands separator in the said number): " + validate(n));
        n = 10000;
        System.out.println("\nOriginal Number: " + n);
        System.out.println("Set thousands separator in the said number): " + validate(n));
        n = 100000;
        System.out.println("\nOriginal Number: " + n);
        System.out.println("Set thousands separator in the said number): " + validate(n));
        n = 1000000;
        System.out.println("\nOriginal Number: " + n);
        System.out.println("Set thousands separator in the said number): " + validate(n));

    }

    public static String validate(int n) {
        String num = Integer.toString(n);
        if (num.length() < 4) return num;
        return validate(Integer.parseInt(num.substring(0, num.length() - 3))) + "#" + num.substring(num.length() - 3);

    }
}
