package dz.manyTasks.regular.task2;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(validate("p"));
        System.out.println(validate("pq"));
        System.out.println(validate("pqq"));
        System.out.println(validate("pqr"));
        System.out.println(validate("prr"));

    }

    public static boolean validate(String str){
        return str.matches("pq*");
    }

    }

