package dz.task1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Arrays;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Publication {
    private long id;
    private int version;
    private String title;
    private LocalDate publishingDate;
    private Author[] authors;



}
