package dz.collection.task2;


import java.util.*;

public class University {
    //список студентов по номеру курса
    public static List<Student> printStudents(List<Student> students, int course) {
        List<Student> studentOfCourse = new ArrayList<>();
        for (Student anystudent : students) {
            if (anystudent.getCourseNum() == course) {
                studentOfCourse.add(anystudent);
            }
        }
        return studentOfCourse;
    }

    //список студентов по имени лектора
    public static Set<String> getStudents(List<Student> students, Lecturer lecturer) {
        Set<String> studentOfLecturer = new LinkedHashSet<>();
        List<String> listsubjects;
        List<String> lecturerTaughtCourses = lecturer.getTaughtCourses();
        for (String anylecurerTaughtCourses : lecturerTaughtCourses) {
            for (Student anystudent : students) {
                listsubjects = anystudent.getCourses();
                for (String anysubjects : listsubjects) {
                    if (anylecurerTaughtCourses == anysubjects)
                        studentOfLecturer.add(anystudent.getName());
                }
            }
        }
        return studentOfLecturer;
    }


    //список студентов по названию предмета
    public static List<Student> getStudents(List<Student> students, String subject) {
        List<Student> studentOfSubject = new ArrayList<>();
        List<String> subjects = new ArrayList<>();
        for (Student anystudent : students) {
            subjects = anystudent.getCourses();
            for (String anysubjects : subjects) {
                if (anysubjects == subject) {
                    studentOfSubject.add(anystudent);
                }
            }
        }
        return studentOfSubject;
    }

    //преподаватель по названию предмета
    public static Lecturer getLectorer(List<Lecturer> lecturers, String subject) {
        List<String> subjects = new ArrayList<>();
        Lecturer teacher = new Lecturer();
        for (Lecturer anylecturer : lecturers) {
            subjects = anylecturer.getTaughtCourses();
            for (String anysubjects : subjects) {
                if (anysubjects == subject) {
                    teacher = anylecturer;
                }
            }
        }
        return teacher;
    }

    public static void main(String[] args) {
        String subject1 = "Algebra";
        String subject2 = "Geometry";
        String subject3 = "Physics";
        String subject4 = "Biology";
        String subject5 = "Chemistry";
        String subject6 = "Geography";
        String subject7 = "History";
        String subject8 = "Literature";
        String subject9 = "Physical education";
        String subject10 = "Technology";

        List<String> listSubject1 = new ArrayList<>(Arrays.asList(subject1, subject2, subject3, subject5, subject10));
        List<String> listSubject2 = new ArrayList<>(Arrays.asList(subject4, subject5, subject6, subject7, subject9));
        List<String> listSubject3 = new ArrayList<>(Arrays.asList(subject1, subject6, subject7, subject8, subject9));
        List<String> listSubject4 = new ArrayList<>(Arrays.asList(subject2, subject3, subject4, subject5, subject9));
        List<String> listSubject5 = new ArrayList<>(Arrays.asList(subject5, subject6, subject7, subject8, subject10));


        Student student1 = new Student("Petya", "petya@student.com", listSubject1, 1);
        Student student2 = new Student("Vasya", "vasiliy@student.com", listSubject1, 1);
        Student student3 = new Student("Anna", "anna@student.com", listSubject1, 1);
        Student student4 = new Student("Liza", "liza@student.com", listSubject1, 1);
        Student student5 = new Student("Tom", "tom@student.com", listSubject1, 1);

        Student student6 = new Student("Tan", "tan@student.com", listSubject2, 2);
        Student student7 = new Student("Vika", "vika@student.com", listSubject2, 2);
        Student student8 = new Student("Alex", "alex@student.com", listSubject2, 2);
        Student student9 = new Student("Anton", "anton@student.com", listSubject2, 2);
        Student student10 = new Student("Dima", "dima@student.com", listSubject2, 2);


        Student student11 = new Student("Kirill", "kirill@student.com", listSubject3, 3);
        Student student12 = new Student("Kate", "kate@student.com", listSubject3, 3);
        Student student13 = new Student("Jane", "jane@student.com", listSubject3, 3);
        Student student14 = new Student("Margo", "margo@student.com", listSubject3, 3);
        Student student15 = new Student("Fedya", "fedya@student.com", listSubject3, 3);


        Student student16 = new Student("Olga", "olga@student.com", listSubject4, 4);
        Student student17 = new Student("Den", "den@student.com", listSubject4, 4);
        Student student18 = new Student("Inga", "inga@student.com", listSubject4, 4);
        Student student19 = new Student("Artem", "artem@student.com", listSubject4, 4);
        Student student20 = new Student("Vlad", "vlad@student.com", listSubject4, 4);

        Student student21 = new Student("Ivan", "ivan@student.com", listSubject5, 5);
        Student student22 = new Student("Alisa", "alisa@student.com", listSubject5, 5);
        Student student23 = new Student("Vera", "vera@student.com", listSubject5, 5);
        Student student24 = new Student("Lev", "lev@student.com", listSubject5, 5);
        Student student25 = new Student("Misha", "misha@student.com", listSubject5, 5);

        List<Student> students = new ArrayList<>(Arrays.asList(student1, student2, student3, student4, student5, student6,
                student7, student8, student9, student10, student11, student12, student13, student14, student15, student16,
                student17, student18, student19, student20, student21, student22, student23, student24, student25));

        List<String> taughtCoursesAlGeo = new ArrayList<>(Arrays.asList(subject1, subject2));
        List<String> taughtCoursesBioChe = new ArrayList<>(Arrays.asList(subject4, subject5));
        List<String> taughtCoursesPhy = new ArrayList<>(Arrays.asList(subject3));
        List<String> taughtCoursesHisLit = new ArrayList<>(Arrays.asList(subject7, subject8));
        List<String> taughtCoursesGeo = new ArrayList<>(Arrays.asList(subject6));
        List<String> taughtCoursesPhyEd = new ArrayList<>(Arrays.asList(subject9));
        List<String> taughtCoursesTech = new ArrayList<>(Arrays.asList(subject10));


        Lecturer lecturer1 = new Lecturer("Aleksandrova G.V.", "aleksandrova@lecturer.com", taughtCoursesAlGeo);
        Lecturer lecturer2 = new Lecturer("Balashova E.A.", "balashova@lecturer.com", taughtCoursesBioChe);
        Lecturer lecturer3 = new Lecturer("Alekseeva R.L.", "alekseeva@lecturer.com", taughtCoursesGeo);
        Lecturer lecturer4 = new Lecturer("Nikitin V.S.", "nikitin@lecturer.com", taughtCoursesPhy);
        Lecturer lecturer5 = new Lecturer("Korolev A.V.", "korolev@lecturer.com", taughtCoursesPhyEd);
        Lecturer lecturer6 = new Lecturer("Smirnov G.S.", "smirnov@lecturer.com", taughtCoursesTech);
        Lecturer lecturer7 = new Lecturer("Popov S.S.", "popov@lecturer.com", taughtCoursesHisLit);
        List<Lecturer> lecturers = new ArrayList<>(Arrays.asList(lecturer1, lecturer2, lecturer3, lecturer4, lecturer5,
                lecturer6, lecturer7));


        System.out.println("Student of first course :" + printStudents(students, 1));
        System.out.println("Student of teacher :" + lecturer1.getName() + " : " + getStudents(students, lecturer1));
        System.out.println("Student of subject :" + subject9 + " : " + getStudents(students, subject9));

        Course algebra = new Course(subject1, getStudents(students, subject1), getLectorer(lecturers, subject1));
        System.out.println(algebra);
        System.out.print("number of students " + subject1 + " : ");
        algebra.getNumberOfStudents();
        Course history = new Course(subject7, getStudents(students, subject7), getLectorer(lecturers, subject7));
        System.out.println(history);
        System.out.print("number of students " + subject7 + " : ");
        history.getNumberOfStudents();
        Course fizra = new Course(subject9, getStudents(students, subject9), getLectorer(lecturers, subject9));
        System.out.println(fizra);
        System.out.print("number of students " + subject9 + " : ");
        fizra.getNumberOfStudents();
        Course geometr = new Course(subject2, getStudents(students, subject2), getLectorer(lecturers, subject2));
        System.out.println(geometr);
        System.out.print("number of students " + subject2 + " : ");
        geometr.getNumberOfStudents();
    }
}
