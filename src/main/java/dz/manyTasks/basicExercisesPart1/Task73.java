package dz.manyTasks.basicExercisesPart1;

public class Task73 {
    public static void main(String[] args) {
        String str1 = "Python";
        String sFirst, sLast;
        String str2 = "";
        if (str1.length() == 0) {
            sFirst = "#";
        } else sFirst = str1.substring(0, 1);
        if (str2.length() == 0) {
            sLast = "#";
        } else sLast = str2.substring(str2.length() - 1);
        System.out.println(sFirst + sLast);
    }
}
