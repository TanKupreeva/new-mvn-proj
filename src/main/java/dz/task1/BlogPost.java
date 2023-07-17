package dz.task1;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class BlogPost extends Publication{
    private String url;

    public BlogPost(long id, int version, String title, LocalDate publishingDate, Author[] authors, String url) {
        super(id, version, title, publishingDate, authors);
        this.url = url;
    }
}
