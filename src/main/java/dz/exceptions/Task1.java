package dz.exceptions;

public class Task1 {
    public static void main(String[] args) {
        int a = 4;
        try{
        System.out.println(a/0);}
        catch (ArithmeticException e){
            System.out.println("Произошла недопустимая арифметическая операция, Вы ввели:");
        }
    }
}
