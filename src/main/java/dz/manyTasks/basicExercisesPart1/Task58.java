package dz.manyTasks.basicExercisesPart1;

public class Task58 {
    public static void main(String[] args) {
        String str = "the quick brown fox jumps over the lazy dog.";
        String[] word = str.split(" ");
        String newStr = "";
        for (String anystring : word) {
            char ch = Character.toUpperCase(anystring.charAt(0));
            newStr = newStr + anystring.replace(anystring.charAt(0), ch) + " ";
        }
        System.out.println(newStr);
    }
}
