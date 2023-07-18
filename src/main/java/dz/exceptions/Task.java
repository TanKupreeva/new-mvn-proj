package dz.exceptions;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class WrongLoginException extends Exception {

    public WrongLoginException() {
        super("Неверный логин");
    }
}

class WrongPasswordException extends Exception {

    public WrongPasswordException() {
        super("Неверный пароль");
    }
}

public class Task {

    public static void checkLogin(String word) throws WrongLoginException {
        String stringPattern = "\\w.{1,20}";
        Pattern p = Pattern.compile(stringPattern);
        Matcher m = p.matcher(word);
        if (m.matches()) {
            System.out.println("Успешно");
        } else {
            throw new WrongLoginException();
        }
    }

    public static void checkPassword(String word) throws WrongPasswordException {
        String stringPattern = "\\w.{1,20}";
        Pattern p = Pattern.compile(stringPattern);
        Matcher m = p.matcher(word);
        if (m.matches()) {
            System.out.println("Успешно");
        } else {
            throw new WrongPasswordException();
        }
    }

    public static void checkConfirmPassword(String word,String word2) throws WrongPasswordException {
        String stringPattern = "\\w.{1,20}";
        Pattern p = Pattern.compile(stringPattern);
        Matcher m = p.matcher(word);
        if (m.matches()&&word.equals(word2)) {
            System.out.println("Успешно");
        } else {
            throw new WrongPasswordException();
        }
    }



    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        String login;
        String password;
        String confirmPassword;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите логин");
        login = sc.nextLine();
        checkLogin(login);
        System.out.println("Введите пароль");
        password = sc.nextLine();
        checkPassword(password);
        System.out.println("Введите повторный пароль");
        confirmPassword = sc.nextLine();
        checkConfirmPassword(password,confirmPassword);
    }
}
