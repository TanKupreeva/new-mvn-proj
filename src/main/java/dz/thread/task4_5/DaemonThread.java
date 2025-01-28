package dz.thread.task4_5;

import dz.streams_tasks.CharacterStream.*;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class DaemonThread extends Thread {
    public DaemonThread() {
        this.setDaemon(true);
    }

//    public boolean isDirectoryEmpty(new File("/Users/tatyanakupreeva/Documents/io_tests/results/"")) {
//        String[] files = directory.list();
//        return files.length == 0;
//    }

    @Override
    public void run() {
        for (; true; ) {

        }
        }}
