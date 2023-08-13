package dz.manyTasks.regular.task24;

public class Task24 {
    public static void main(String[] args) {


        String text = "Java";
        System.out.println("Original String: " + text);
        System.out.println("Separate consonants and vowels of the said string: " + validate(text));
        text = "JavaScript";
        System.out.println("\nOriginal String: " + text);
        System.out.println("Separate consonants and vowels of the said string: " + validate(text));
        text = "SQLite";
        System.out.println("\nOriginal String: " + text);
        System.out.println("Separate consonants and vowels of the said string: " + validate(text));
    }

    public static String validate(String str){
        return str.replaceAll("(?i)[aoueyi]","")+str.replaceAll("(?i)[^aeouiy]","");
    }

}
