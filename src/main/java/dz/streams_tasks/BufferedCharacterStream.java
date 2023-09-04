package dz.streams_tasks;

import java.io.*;

public class BufferedCharacterStream {
    public static String read(String path) {
        StringBuilder sb = new StringBuilder();
        try (Reader reader = new BufferedReader(new FileReader(path))) {
            int charCode;
            if ((charCode = reader.read()) == -1) {
                System.out.println("File is empty");
            } else {
                sb = sb.append((char) charCode);
                while ((charCode = reader.read()) != -1) {
                    sb = sb.append((char) charCode);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }


    public static void write(String path, String text, boolean append) {
        try (Writer writer = new BufferedWriter(new FileWriter(path, append), 1000)) {
            writer.write(text);
            writer.write(' ');
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void write(String path, String text) {
        write(path, text, false);
    }

    public static void main(String[] args) {
        File file = new File("/Users/tatyanakupreeva/Documents/io_tests/byte_file3.txt");
        write("/Users/tatyanakupreeva/Documents/io_tests/byte_file3.txt", "Hello Tatyana", true);
        System.out.println(read("/Users/tatyanakupreeva/Documents/io_tests/byte_file3.txt"));

    }
}
