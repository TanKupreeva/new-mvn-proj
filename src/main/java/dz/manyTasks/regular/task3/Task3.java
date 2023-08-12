package dz.manyTasks.regular.task3;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(validate("java_exercises"));
        System.out.println(validate("Java_exercises"));
        System.out.println(validate("java_Exercises"));
        System.out.println(validate("Java_Exercises"));
    }
    public static boolean validate(String str){
        return str.matches("^[a-z]+_[a-z]+$");
    }
}
