package dz.collection.task2;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Course {
    private String subject;
    List<Student> students;
    private Lecturer teacher;


    public void addStudent(Student student) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
    }

    public void assignTeachers(Lecturer teacher) {

    }

    public void getNumberOfStudents() {
        System.out.println(students.size());
    }

    public Lecturer getTeacher() {
        return teacher;
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

}
