package dz.manyTasks.aston1;

import java.util.Arrays;
import java.util.List;

public final class EnglishAlphabet {
    private final int numberOfLetters;
    private final int numberOfSounds;
    private final List<Character> letters;

    public EnglishAlphabet(int numberOfLetters, int numberOfSounds, List<Character> letters) {
        this.numberOfLetters = numberOfLetters;
        this.numberOfSounds = numberOfSounds;
        this.letters = letters;
    }

    public int getNumberOfLetters() {
        return numberOfLetters;
    }

    public int getNumberOfSounds() {
        return numberOfSounds;
    }

    public List<Character> getLetters() {
        return List.copyOf(letters);
    }

    public static void main(String[] args) {
        List<Character> list = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'o', 'p',
                'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');

        EnglishAlphabet englishAlphabet = new EnglishAlphabet(26, 44, list);

        System.out.println(englishAlphabet.getLetters());
        System.out.println("Number of letters is " + englishAlphabet.getNumberOfLetters());
        System.out.println("Number of sounds is " + englishAlphabet.getNumberOfSounds());
        englishAlphabet.getLetters().add('ю');

    }


}
