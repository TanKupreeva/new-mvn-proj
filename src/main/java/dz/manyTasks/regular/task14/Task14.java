package dz.manyTasks.regular.task14;

public class Task14 {
    public static void main(String[] args) {
        String text = "C++";
        System.out.println("Original string: "+text);
        System.out.println("The number of vowels: "+validate(text));
        text = "Java";
        System.out.println("\nOriginal string: "+text);
        System.out.println("The number of vowels: "+validate(text));
        text = "MID-CENTRALIZED";
        System.out.println("\nOriginal string: "+text);
        System.out.println("The number of vowels: "+validate(text));
        text = "LOWERED";
        System.out.println("\nOriginal string: "+text);
        System.out.println("The number of vowels: "+validate(text));
    }
    public static int validate(String str){
        return str.replaceAll("[^aeiouyYAEIUO]","").length();
    }
}
