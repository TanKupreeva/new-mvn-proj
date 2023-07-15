package errors;

import model.Person;

public class ExceptionsTester {
    public static void main(String[] args) {
        System.out.println("Begin.");
        Person p1 = new Person();

        Throwable throwable;
        Error error;
        Exception exception;

        try {
            //потенциально небезопасный код.
            //пытаемся отловить exception к-ый ожидает нас в блоке catch
            p1.clone();//will throw new NullPointerException object!
        }
        // в блоке ожидается объект конкретного типа
        catch (NullPointerException e) {
            // обработка в случае наступления данной ошибки
            System.out.println("Oooops! It's NullPointerException" + e.getMessage());
            e.printStackTrace();

        } finally {
            //блок выполниться в любом случае(при ошибке или нет)
            System.out.println("final job");
        }


        int[] array = {2, 12, 33};

        int i = 10;
        try {

            int val = array[i];
            System.out.println(val);
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Oooops! Wrong index " + i);
            e.printStackTrace();
            System.out.println("please user next indexes bound -> from 0 to " + (array.length - 1));


        } finally {
            //блок выполниться в любом случае(при ошибке или нет)
            System.out.println(array[0]);
        }


        String str = "Hello Java world!";
        String[] words = str.split(" ");
        for (String word : words) {
            try {
                System.out.println(word.charAt(word.indexOf('o')));
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("No such symbol 'o' in word "+word);
            }




        } System.out.println("End.");
    }}
