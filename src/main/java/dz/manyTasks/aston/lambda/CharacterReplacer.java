package dz.manyTasks.aston.lambda;
@FunctionalInterface
public interface CharacterReplacer {
    String replaceCharacters(String input, char oldChar, char newChar);
}
