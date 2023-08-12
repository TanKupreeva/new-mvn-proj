package dz.manyTasks.regular.task5;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(validate("phkuyrt"));
        System.out.println(validate("pq"));
        System.out.println(validate("pccddbbjjjq"));
        System.out.println(validate("Jar"));
        System.out.println(validate("pjhut"));
    }
    public static boolean validate(String str){
        return str.matches("p{1}.*q$");
    }
}
