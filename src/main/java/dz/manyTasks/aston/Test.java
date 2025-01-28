package dz.manyTasks.aston;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;

public class Test {
    public static void main(String[] args) throws Exception {
        FileReader fis = new FileReader("/Users/tatyanakupreeva/Documents/io_tests/война_и_мир.txt");
//        FileInputStream fis = new FileInputStream("/Users/tatyanakupreeva/Documents/io_tests/война_и_мир.txt");

        Date start = new Date();
        int code;
//        System.out.println("Code = " + code);
//        char ch = (char) code;
//        System.out.print(ch);
        while ((code = fis.read()) != -1) {
            System.out.print((char) code);

        }
        Date end = new Date();
        System.out.println();
        System.out.println(start);
        System.out.println(end);
        Function<Double, Long> function = d -> Math.round(d);
        System.out.println(function.apply(5.7));

    }
}
