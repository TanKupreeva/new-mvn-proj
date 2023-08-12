package dz.manyTasks.basicExercisesPart1;

public class Task60 {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog.";
        String[] word = str.split(" ");
        System.out.println(word[word.length - 2]);
    }
}
