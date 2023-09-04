package dz.streams_tasks;

import java.io.*;

public class BufferedByteStream {
    public static void write(String path, String text, boolean append) {
        try (OutputStream ops = new BufferedOutputStream(new FileOutputStream(path, append), 1000)) {
            char[] chars = text.toCharArray();
            byte[] bytes = new byte[chars.length];
            for (int i = 0; i < chars.length; i++) {
                bytes[i] = (byte) chars[i];
            }
            ops.write(bytes);
            ops.write(' ');
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void write(String path, String text) {
        write(path, text, false);
    }

    public static String read(String path) {
        StringBuilder sb = new StringBuilder();
        try (InputStream ips = new BufferedInputStream(new FileInputStream(path), 1000)) {
            int bytecode;
            if ((bytecode = ips.read()) == -1) {
                System.out.println("File is empty");
            } else {
                sb = sb.append((char) bytecode);
                while ((bytecode = ips.read()) != -1) {
                    sb = sb.append((char) bytecode);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        File file = new File("/Users/tatyanakupreeva/Documents/io_tests/byte_file2.txt");
        write("/Users/tatyanakupreeva/Documents/io_tests/byte_file2.txt", "Hello Tatyana", true);
        System.out.println(read("/Users/tatyanakupreeva/Documents/io_tests/byte_file2.txt"));
    }
}
