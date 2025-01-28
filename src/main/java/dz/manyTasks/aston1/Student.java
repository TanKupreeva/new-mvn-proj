package dz.manyTasks.aston1;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public  class Student {

    private  String firstName;
    private  String name;

    private  List<Book> books;


}
