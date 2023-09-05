package dz.collection.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Lecturer implements Person {
    private String name;
    private String emailAddress;
    private List<String> taughtCourses;

    public List getTaughtCourses() {
        return taughtCourses;
    }

    @Override
    public String getName() {
        return "lecturer " + name;
    }

    @Override
    public String getEmailAddress() {
        return emailAddress + "@lecturer.com";
    }
}
