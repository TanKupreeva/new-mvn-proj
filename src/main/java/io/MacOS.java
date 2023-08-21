package io;

import util.IOUtils;

import java.io.*;
import java.util.Date;

public class MacOS {
    public static void main(String[] args) {
        File file = new File("/Users/tatyanakupreeva/Documents/io_tests/text2.txt");
        try {
            file.createNewFile();
            File file2 = new File("/Users/tatyanakupreeva/Documents/io_tests/text.pages");
            file2.delete();
            File file3 = new File("/Users/tatyanakupreeva/Documents/io_tests");
            File[] files = file3.listFiles();
            System.out.println(files.length);
            System.out.println(file3.getName());
            System.out.println(file3.getPath());
            IOUtils.printStat("/Users/tatyanakupreeva/Documents/io_tests");

            Date startDate = new Date();
            InputStream is = new FileInputStream("/Users/tatyanakupreeva/Documents/io_tests/text.txt");
            int code = is.read();
            System.out.println("Code = " + code);
            char ch = (char) code;
            System.out.print(ch);
            while ((code = is.read()) != -1) {
                System.out.print((char) code);
            }
            Date endDate = new Date();


            Reader reader = new FileReader("/Users/tatyanakupreeva/Documents/io_tests/text2.txt");
            int characterCode;
            while ((characterCode = reader.read()) != -1) {
                System.out.print((char) characterCode);
            }

            Date startDate2 = new Date();
            Reader reader2 = new BufferedReader(new FileReader("/Users/tatyanakupreeva/Documents/io_tests/text.txt"));
            int characterCode2;
            while ((characterCode2 = reader2.read()) != -1) {
                System.out.print((char) characterCode2);
            }
            Date endDate2 = new Date();
            long mills = endDate.getTime() - startDate.getTime();
            System.out.println("processing took : " + mills);
            long mills2 = endDate2.getTime() - startDate2.getTime();
            System.out.println("processing took2 : " + mills2);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}