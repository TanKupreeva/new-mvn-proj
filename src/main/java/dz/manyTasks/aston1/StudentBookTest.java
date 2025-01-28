package dz.manyTasks.aston1;

import java.util.*;


public class StudentBookTest {
    public static void main(String[] args) {
        Book book1 = new Book("Мат анализ", 345, 1977);
        Book book2 = new Book("Химия", 234, 1988);
        Book book3 = new Book("основы Java", 789, 1999);//2010
        Book book4 = new Book("Философия", 254, 1999);
        Book book5 = new Book("Физика", 289, 1997);
        Book book6 = new Book("Мат анализ", 345, 1977);
        Book book7 = new Book("основы Java", 789, 1999);//2010
        Book book8 = new Book("Психология", 123, 2000);
        Book book9 = new Book("Психология", 123, 2000);
        Book book10 = new Book("English", 200, 1999);//2015
        Book book11 = new Book("English", 200, 1999);//2015
        Book book12 = new Book("English", 200, 1999);//2015
        Book book13 = new Book("основы Java", 889, 2019);//2019
        Book book14 = new Book("основы Java", 980, 2022);//2022
        Book book15 = new Book("Мат анализ", 345, 1977);
        Book book16 = new Book("Мат анализ", 345, 1977);
        Book book17 = new Book("Физика", 289, 1997);
        Book book18 = new Book("Физика", 289, 1997);
        Book book19 = new Book("Физика", 289, 1997);
        Book book20 = new Book("Химия", 234, 1988);

        Student student1 = new Student( "Иванов", "Иван", Arrays.asList(book1, book12, book3, book4, book5));
        Student student2 = new Student( "Петров", "Петр", Arrays.asList(book19, book7, book8, book2, book11));
        Student student3 = new Student( "Сидоров", "Сидр", Arrays.asList(book9, book10, book13, book18, book15));
        Student student4 = new Student( "Павлов", "Павел", Arrays.asList(book16, book14, book17, book20, book6));

         List<Student> studentList = List.of(student1, student2, student3, student4);

        studentList.stream()
              //  .peek(System.out::println)
                .map(Student::getBooks)
                .flatMap(Collection::stream)
                .sorted(Comparator.comparingInt(Book::getPage))
                .distinct()
                .filter(n -> n.getYear() > 2000)
                .limit(3)
                .map(Book::getYear)
                .findFirst()
                .ifPresentOrElse(
                        str -> System.out.println(str),
                        () -> System.out.println("Книги отсутствуют"));
    }
}


//   studentList.stream().forEach(System.out::println);
// книга для каждого студента
//        studentList.stream().map(m -> {
//            System.out.println(m.getFirstName() + " " + m.getName() + " ");
//            return m.getBooks();
//        }).forEach(System.out::println);
