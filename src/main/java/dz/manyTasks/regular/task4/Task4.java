package dz.manyTasks.regular.task4;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(validate("Java"));
        System.out.println(validate("java"));
        System.out.println(validate("javA"));
        System.out.println(validate("JAVa"));
        System.out.println(validate("Ja"));
        System.out.println(validate("aJ"));
    }
    public static boolean validate(String str){
        return str.matches("^[A-Z]{1}[a-z]+$");
    }
}
