package dz.streams_tasks;


import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ByteStream {
    //    Создать метод который ДОПОЛНИТ существующий файл введенной информацией столько раз сколько
//    введет пользователь. updateFile(String path , String textForUpdate, int num){...}
    public static void updateFile(String path, String textForUpdate, int num) {
        do {
            writeText(path, textForUpdate, true);
            num--;
        } while (num > 0);
    }

    public static void writeText(String path, String text, boolean append) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(path, append)) {
            char[] chars = text.toCharArray();
            byte[] b = new byte[chars.length];
            for (int i = 0; i < chars.length; i++) {
                b[i] = (byte) chars[i];
            }
            fileOutputStream.write(b);
            fileOutputStream.write(' ');
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeText(String path, String data) {
        writeText(path, data, false);

    }

    public static String read(String path) {
        StringBuilder sb = new StringBuilder();
        try (FileInputStream fileInputStream = new FileInputStream(path)) {

            int byteCode;
            if ((byteCode = fileInputStream.read()) == -1) {
                System.out.println("File is empty");
            } else {
                sb = sb.append((char) byteCode);
                while ((byteCode = fileInputStream.read()) != -1) {
                    sb = sb.append((char) byteCode);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }

    //Создать метод который заполнит файл случайными числами (каждое с новой строки).
// Если генерируется число которое уже было записано, дополнять звёздочкой*
    public static void printGenRandom(String path, int a, int b, int n) {
        int[] arr = new int[n];
        String str = "";
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * (b + 1 - a)) + a;
            int counter = 0;
            for (int j = 0; j < i; j++) {
                if (i != 0 && arr[i] == arr[j])
                    counter++;
            }
            str = arr[i] + "";
            while (counter > 0) {
                str = str + "*";
                counter--;
            }
            writeText(path, str, true);
        }
    }

    //Создать метод который отсортирует файл с числами по убыванию.
    public static void sort(String path) {

        String str = read(path);
//            System.out.println(str);
        String[] word = str.split(" ");
        int[] number = new int[word.length];
        for (int i = 0; i < word.length; i++) {
            number[i] = Integer.parseInt(word[i]);
        }

        for (int i = 1; i < number.length; i++) {
            for (int j = number.length - 1; j >= i; j--) {
                if (number[j - 1] < number[j]) {
                    int t = number[j - 1];
                    number[j - 1] = number[j];
                    number[j] = t;
                }
            }
        }
        String result = "";
        for (int i = 0; i < number.length; i++) {
            result = result + number[i] + " ";
        }
        System.out.println(result);
        writeText(path, result);

    }

    public static void find(String path, String resultPath, String search) {
        String str = read(path).toLowerCase();

        String resultFormat = "\"%s\" : %d";
        search = search.toLowerCase();
        int counter = 0;
        if (str.contains(search)) {
            int index;
            while ((index = str.indexOf(search)) != -1) {
                counter++;
                str = str.substring(index + search.length());
            }
        }
        System.out.println(String.format(resultFormat, search, counter));
        writeText(resultPath, String.format(resultFormat, search, counter));
    }


//8. Прочитайте текст из файла, удалите все лишние пробелы, знаки табуляции. Пересохраните текст задом наперед.
    public static void delete(String path) {
        String str = read(path).replaceAll(" ", "");
        str = str.replaceAll("\t", "");
        StringBuilder sb = new StringBuilder(str);
        sb = sb.reverse();
        writeText(path, "\n" + sb.toString(), true);
    }

    public static void main(String[] args) {
        try {
//Создать файл исп. класс File. Записать в файл текст.
            File file = new File("/Users/tatyanakupreeva/Documents/io_tests/byte_file.txt");
            boolean isExsist = file.exists();
            if (!isExsist) {
                file.createNewFile();
                System.out.println("File is created");
            } else System.out.println("File already exists");

            writeText("/Users/tatyanakupreeva/Documents/io_tests/byte_file.txt", "hello");
//Прочитать файл. Вывести весь существующий текст в консоль в верхнем регистре. Если файл пустой,
//написать об этом в консоль.
            FileInputStream fileInputStream = new FileInputStream("/Users/tatyanakupreeva/Documents/io_tests/byte_file.txt");
            int byteCode;
            String str = "";
            if ((byteCode = fileInputStream.read()) == -1) {
                System.out.println("File is empty");
            } else {
                str = str + (char) byteCode;
                while ((byteCode = fileInputStream.read()) != -1) {
                    str = str + ((char) byteCode);
                }
                System.out.println(str.toUpperCase());
            }

        } catch (IOException e) {
            e.printStackTrace();

        }
        updateFile("/Users/tatyanakupreeva/Documents/io_tests/byte_file.txt", "World", 5);
        System.out.println(read("/Users/tatyanakupreeva/Documents/io_tests/byte_file.txt"));

        printGenRandom("/Users/tatyanakupreeva/Documents/io_tests/byte_file_random.txt", -2, 1, 20);

        writeText("/Users/tatyanakupreeva/Documents/io_tests/byte_file_sort.txt", "777");
        writeText("/Users/tatyanakupreeva/Documents/io_tests/byte_file_sort.txt", "99", true);
        writeText("/Users/tatyanakupreeva/Documents/io_tests/byte_file_sort.txt", "100000", true);
        writeText("/Users/tatyanakupreeva/Documents/io_tests/byte_file_sort.txt", "-15", true);

        System.out.println(read("/Users/tatyanakupreeva/Documents/io_tests/byte_file_sort.txt"));

        sort("/Users/tatyanakupreeva/Documents/io_tests/byte_file_sort.txt");
        find("/Users/tatyanakupreeva/Documents/io_tests/колобок.txt", "/Users/tatyanakupreeva/Documents/io_tests/find_text_колобок.txt", "bun");
        delete("/Users/tatyanakupreeva/Documents/io_tests/поговорка.txt");
    }
}
