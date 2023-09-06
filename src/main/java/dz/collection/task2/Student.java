package dz.collection.task2;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Student implements Person {

    private String name;
    private String emailAddress;
    private List<String> courses;
    private int courseNum;


    @Override
    public String getName() {
        return "student " + name;
    }

    @Override
    public String getEmailAddress() {
        return emailAddress;
    }
}
