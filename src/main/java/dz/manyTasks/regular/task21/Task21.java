package dz.manyTasks.regular.task21;

public class Task21 {
    public static void main(String[] args) {
        String text ="Java Exercises";
        System.out.println("Original string: "+text);
        System.out.println("After removing all non-alphanumeric characters from the said string: "+validate(text));
        text ="Ex@^%&%(ercis*&)&es";
        System.out.println("\nOriginal string: "+text);
        System.out.println("After removing all non-alphanumeric characters from the said string: "+validate(text));
    }
    public static String validate(String str){
        return str.replaceAll("(?i)[^a-z0-9]","");
    }

}
