package dz.task1;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.Arrays;

@Data
@AllArgsConstructor
public class Book extends Publication {
    private int numPages;

    public Book(long id, int version, String title, LocalDate publishingDate, Author[] authors, int numPages) {
        super(id, version, title, publishingDate, authors);
        this.numPages = numPages;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + getId() +
                ", version=" + getVersion() +
                ", title='" + getTitle() + '\'' +
                ", publishingDate=" + getPublishingDate() +
                ", authors=" + Arrays.toString(getAuthors()) +
                ", numPages=" + numPages +
                "} ";
    }


}
