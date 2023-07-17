//package dz.exceptions;
//
//
//import java.util.Scanner;
//import java.util.regex.Pattern;
//import java.util.regex.Matcher;
//
//
//public class Task3 {
//
//    public void shablon(String word) throws WrongLoginException {
//        String stringPattern = "\\w.{1,20}";
//        Pattern p = Pattern.compile(stringPattern);
//        Matcher m = p.matcher(word);
//        if (m.matches()) {
//
//        } else {
//           throw new WrongLoginException("неверно");
//        }
//    }
//
//class WrongLoginException extends Exception{
//
//
//    public WrongLoginException(String message) {
//        super(message);
//    }
//}
//
//    public static void main(String[] args) throws WrongLoginException {
//        String login;
//        String passWord;
//        String confirmPassword;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите логин");
//        login = sc.nextLine();
//        shablon(login);
//        System.out.println("Введите пароль");
//        passWord = sc.nextLine();
//        shablon(passWord);
//        System.out.println("Введите повторный пароль");
//        confirmPassword = sc.nextLine();
//        shablon(confirmPassword);
//        if(confirmPassword.equals(passWord)){
//            System.out.println("Успешно");
//        }else {
//            System.out.println("Неверный пароль");
//        }
//
//
//
//    }
//}
//
