package dz.task1;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Magazine extends Publication{
    private int number;

    public Magazine(long id, int version, String title, LocalDate publishingDate, Author[] authors, int number) {
        super(id, version, title, publishingDate, authors);
        this.number = number;
    }
}
