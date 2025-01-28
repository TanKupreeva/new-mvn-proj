package dz.manyTasks.aston.lambda;

public interface StringOperation {
    void checkLength(String input);

    String toUpperCase(String input);
    String replaceCharacters(String input, char oldChar, char newChar);

}
