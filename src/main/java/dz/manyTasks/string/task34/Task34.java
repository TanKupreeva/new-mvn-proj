package dz.manyTasks.string.task34;

public class Task34 {
    public static void main(String[] args) {
        String str = "successes";

        int[] abc = new int[128];
        int i;
        for (i = 0; i < str.length(); i++) {
            (abc[str.charAt(i)])++;
        }
        char a = 'a';
        int maxOne = abc[0], maxNext = 0;
        for (i = 1; i < abc.length; i++) {
            if (maxOne < abc[i]) {
                maxOne = abc[i];
            }
        }
        for (int j = 1; j < Integer.MAX_VALUE; j++) {
            for (i = 0; i < abc.length; i++) {
                if (abc[i] == maxOne - j) {
                    a = (char) i;
                    System.out.println(a + " " + abc[i]);
                    return;
                }
            }
        }
    }
}
