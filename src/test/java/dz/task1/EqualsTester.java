package dz.task1;

import java.time.LocalDate;

public class EqualsTester {


    public static void printHushCodeAuthors(Author[] arr) {
        for (Author anyAuthor : arr) {
            System.out.println("HashCode " + anyAuthor.getFirstName() + " " + anyAuthor.getLastName() + " = " + anyAuthor.hashCode());
        }
        System.out.println("================================================");
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - 1; j++) {
                if (arr[i].hashCode() == arr[j].hashCode() & i != j) {
                    System.out.println(arr[i].getFirstName() + " " + arr[i].getLastName() + " true " + arr[j].getFirstName() + " " + arr[j].getLastName());
                    counter++;
                }

            }
        }
        if (counter == 0) {
            System.out.println("Not found identical objects");
        }
    }


    public static void printHushCodePublication(Publication[] pub) {
        for (Publication anyPub : pub) {
            System.out.println("HashCode " + anyPub.getTitle() + " = " + anyPub.hashCode());
        }
        System.out.println("=============================================");
        int counter = 0;
        for (int i = 0; i < pub.length; i++) {
            for (int j = 1; j < pub.length - 1; j++) {
                if (pub[i].hashCode() == pub[j].hashCode() & i != j) {
                    System.out.println(pub[i].getTitle() + " true " + pub[j].getTitle());
                    counter++;
                }
            }
        }
        if (counter == 0) {
            System.out.println("Not found identical objects");
        }

    }


    public static void printEqualsAuthor(Author[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - 1; j++) {
                if (arr[i].equals(arr[j]) && i != j) {
                    System.out.println(arr[i].getFirstName() + " " + arr[i].getLastName() + " true " + arr[j].getFirstName() + " " + arr[j].getLastName());
                    counter++;
                }
            }
        }
        if (counter == 0) {
            System.out.println("Not found identical objects (equals)");
        }
    }

    public static void printEqualsPublication(Publication[] pub) {
        int counter = 0;
        for (int i = 0; i < pub.length; i++) {
            for (int j = 1; j < pub.length - 1; j++) {
                if (pub[i].equals(pub[j]) && i != j) {
                    System.out.println(pub[i].getTitle() + " true " + pub[j].getTitle());
                    counter++;
                }
            }
        }
        if (counter == 0) {
            System.out.println("Not found identical objects (equals)");
        }
    }


    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        Author a1 = new Author(1, 1, "В. Д.", "Герасимов");
        Author a2 = new Author(2, 1, "О. Н.", "Пирютко");
        Author a3 = new Author(3, 1, "А. П.", "Лобанов");
        Author[] authorsMath5 = {a1, a2, a3};
        Book b1 = new Book(1, 1, "Математика 5 класс", date, authorsMath5, 192);

        Author a4 = new Author(4, 1, "Г. Л.", "Муравьёва");
        Author a5 = new Author(5, 1, "М. А.", "Урбан");
        Author[] authorsMath4 = {a4, a5};
        Book b2 = new Book(2, 1, "Математика 4 класс", date, authorsMath4, 136);

        Author a6 = new Author(6, 1, "И. Г.", "Арефьева");
        Author[] authorsAlg8 = {a2, a6};
        Book b3 = new Book(3, 1, "Алгебра. 8 класс", date, authorsAlg8, 160);
        Book[] books = {b1, b3};
        a2 = new Author(2, 1, "О. Н.", "Пирютко", books);

        Author a7 = new Author(7, 1, "Л. А.", "Исаченкова");
        Author a8 = new Author(8, 1, "Е. В.", "Громыко");
        Author a9 = new Author(9, 1, "Ю. Д.", "Лещинский");
        Author[] authorsPhys7 = {a7, a8, a9};
        Book b4 = new Book(4, 1, "Физика. 7 класс", date, authorsPhys7, 168);


        Author a10 = new Author(10, 1, "А. А.", "Сокольский");
        Author a11 = new Author(11, 1, "Е. В.", "Захаревич");
        Author[] authorsPhys9 = {a7, a10, a11};
        Book b5 = new Book(5, 1, "Физика. 9 класс", date, authorsPhys9, 208);
        Book[] books1 = {b4, b5};
        a7 = new Author(7, 1, "Л. А.", "Исаченкова", books1);

        Author a12 = new Author(12, 1, "Юрий", "Дудь");
        Author[] dyd = {a12};
        BlogPost bp1 = new BlogPost(1, 1, "ВДудь", date, dyd, "https://www.youtube.com/channel/UCMCgOm8GZkHp8zJ6l7_hIuA");

        Author a13 = new Author(13, 1, "Максим", "Кац");
        Author[] kac = {a13};
        BlogPost bp2 = new BlogPost(2, 1, "Максим Кац", date, kac, "https://www.youtube.com/@Max_Katz");

        Author a14 = new Author(14, 1, "Нина", "Зайченко");
        Author[] zay = {a14};
        BlogPost bp3 = new BlogPost(3, 1, "Nionila Bronstein", date, zay, "https://www.youtube.com/@NionilaBronstein");
        BlogPost bp4 = new BlogPost(4, 1, "Slingopark", date, zay, "https://www.youtube.com/@Slingopark");
        BlogPost bp5 = new BlogPost(5, 1, "Ніна Зайченко – все про грудне вигодовування", date, zay, "https://www.youtube.com/@milkblogger/channels");
        BlogPost[] blogPosts1 = {bp3, bp4, bp5};
        a14 = new Author(14, 1, "Нина", "Зайченко", blogPosts1);

        Author a15 = new Author(15, 1, "Франсуа", "Жиру");
        Author a16 = new Author(16, 1, "Жан-Доиминик", "Боби");
        Author a17 = new Author(17, 1, "Валери", "Тореньян");
        Author a18 = new Author(18, 1, "Франсуаз-Мари", "Сантуччи");
        Author[] elle = {a15, a16, a17, a18};
        Magazine m1 = new Magazine(1, 1, "ELLE", date, elle, 23);


        Author a19 = new Author(19, 1, "Анна", "Винтур");
        Author a20 = new Author(20, 1, "Эдвард", "Эннинфул");
        Author a21 = new Author(21, 1, "Филлип", "Власов");
        Author a22 = new Author(22, 1, "Талия", "Карафилиду");
        Author a23 = new Author(23, 1, "Ксения", "Соловьева");
        Author a24 = new Author(24, 1, "Кристи", "Клеменс");
        Author a25 = new Author(25, 1, "Кристиане", "Арп");
        Author a26 = new Author(25, 1, "Кристиане", "Арп");

        Author[] vogue = {a19, a20, a21, a22, a23, a24, a25, a26};
        Magazine m2 = new Magazine(2, 1, "Vogue", date, vogue, 12);


        Author[] allAutors = {a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25,a26};
        Publication[] allPublications = {b1, b2, b3, b4, b5, bp1, bp2, bp3, bp4, bp5, m1, m2};

        printHushCodeAuthors(allAutors);
        System.out.println("===========================================");
        printHushCodePublication(allPublications);
        System.out.println("===========================================");
        printEqualsAuthor(allAutors);
        System.out.println("===========================================");
        printEqualsPublication(allPublications);



    }
}
