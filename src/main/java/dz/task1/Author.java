package dz.task1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author {
    private long id;
    private int version;
    private String firstName;
    private String lastName;
    private Publication [] publications;

    public Author(long id, int version, String firstName, String lastName) {
        this.id = id;
        this.version = version;
        this.firstName = firstName;
        this.lastName = lastName;
    }



    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", version=" + version +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", publications=" + Arrays.toString(publications) +
                '}';
    }
}
