package dz.exceptions;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class WrongLoginException extends Exception {

    public WrongLoginException() {
        super("Неверный логин. Длина логина должна быть меньше 20 символов. " +
                "\n Содержать только латинские буквы, цифры и знак подчеркивания.");
    }
}

class WrongPasswordException extends Exception {

    public WrongPasswordException() {
        super("Неверный пароль. Длина пароль должна быть меньше 20 символов. " +
                "\n Содержать только латинские буквы, цифры и знак подчеркивания. Пароль и повторный пароль должны быть равны.");
    }
}

public class Task3 {

    public static boolean check(String log, String pass, String conPass) throws WrongLoginException, WrongPasswordException {
        boolean enter = false;
        try {

            if (log.matches("\\w{1,20}")) {
                enter = true;
            } else {
                enter = false;
                throw new WrongLoginException();
            }//покидаем метод
            if (pass.matches("\\w{1,20}")) {
                enter = true;
            } else {
                enter = false;
                throw new WrongPasswordException();
            }//покидаем метод
            if (conPass.matches("\\w{1,20}") && pass.equals(conPass)) {
                enter = true;
            } else {
                enter = false;
                throw new WrongPasswordException();
            }//покидаем метод

        } catch (WrongLoginException e) {
            e.printStackTrace();
        } catch (WrongPasswordException e) {
            e.printStackTrace();
        } finally {
            return enter;
        }
    }


    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        String login;
        String password;
        String confirmPassword;
        Scanner sc = new Scanner(System.in);
        System.out.println("Регистрация пользователя");
        System.out.println("Введите логин");
        login = sc.nextLine();
        System.out.println("Введите пароль");
        password = sc.nextLine();
        System.out.println("Введите повторный пароль");
        confirmPassword = sc.nextLine();
        boolean a = check(login, password, confirmPassword);
        if (a == true) {
            System.out.println("Регистрация прошла успешно");
        }

    }
}
