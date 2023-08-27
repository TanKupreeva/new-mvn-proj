package dz.streams_tasks;

import dz.manyTasks.interfaces.task3.Flyable;

import java.io.*;

public class Сharacter_stream {
    public static void main(String[] args) {


        try {
            OutputStream charStream = new FileOutputStream("/Users/tatyanakupreeva/Documents/io_tests/character_file.txt");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }}
