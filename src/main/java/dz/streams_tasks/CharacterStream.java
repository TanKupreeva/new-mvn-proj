package dz.streams_tasks;

import java.io.*;

public class CharacterStream {

    public static void write(String data, String path, boolean append) {
        try (
                Writer writer = new FileWriter(path, append)
        ) {
            writer.write(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void write(String data, String path) {
        write(data, path, false);
    }

    public static String read(String path) {
        StringBuilder sb = new StringBuilder();
        try (Reader reader = new FileReader(path)) {
            int characterCode;
            if ((characterCode = reader.read()) == -1) {
                System.out.println("File is empty");
            } else sb = sb.append((char) characterCode);
            while ((characterCode = reader.read()) != -1) {
                sb = sb.append((char) characterCode);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }
//Создать метод который ДОПОЛНИТ существующий файл введенной информацией столько раз сколько введет пользователь.
// updateFile(String path , String textForUpdate, int num){...}

    public static void updateFile(String path, String textForUpdate, int num) {
        while (num > 0) {
            write(textForUpdate, path, true);
            num--;
        }
    }

    //Создать метод который заполнит файл случайными числами (каждое с новой строки).
    // Если генерируется число которое уже было записано, дополнять звёздочкой* .

    public static void printgenRandom(String path, int a, int b, int n) {
        int[] num = new int[n];
        for (int i = 0; i < num.length; i++) {
            String str = "";
            int counter = 0;
            num[i] = (int) (Math.random() * (b + 1 - a)) + a;
            str = num[i] + "";
            for (int j = 0; j < i; j++) {
                if (i != 0 && num[i] == num[j]) {
                    counter++;
                }
            }
            while (counter != 0) {
                str = str + "*";
                counter--;
            }
            write(str, path, true);
            write("\n", path, true);
        }
    }

    //Создать метод который отсортирует файл с числами по убыванию.

    public static void sortNumber(String path) {
        String str = read(path);
        String[] arr = str.split(" ");
        int[] num = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            num[i] = Integer.parseInt(arr[i]);
        }
        for (int i = 1; i < num.length; i++) {
            for (int j = num.length - 1; j >= i; j--) {
                if (num[j - 1] < num[j]) {
                    int t = num[j - 1];
                    num[j - 1] = num[j];
                    num[j] = t;
                }
            }
        }
        write("", path);
        for (int i = 0; i < num.length; i++) {
            write(String.valueOf(num[i]), path, true);
            write(" ", path, true);
        }


    }

    //6. Создать метод который найдет указанный текст в файле. Выведите количество повторений в консоль.
    public static String findText(String path, String search) {
        search = search.toLowerCase();
        String str = read(path).toLowerCase();
        int counter = 0;
        int index;
        while ((index = str.indexOf(search)) != -1) {
            counter++;
            str = str.substring(index + search.length());
        }
        String result = "\"" + search + "\" : " + counter;
        return result;
    }

    //8. Прочитайте текст из файла, удалите все лишние пробелы, знаки табуляции. Пересохраните текст задом наперед.
    public static void reverse(String path, String resultPath) {
        String str = read(path);
        str = str.replaceAll(" ", "");
        str = str.replaceAll("\t", "");
        StringBuilder sb = new StringBuilder(str);
        sb = sb.reverse();
        write(sb.toString(), resultPath);

    }

    public static void main(String[] args) {
        File file = new File("/Users/tatyanakupreeva/Documents/io_tests/new_file_char.txt");
        write("Привет Таня", "/Users/tatyanakupreeva/Documents/io_tests/new_file_char.txt");
        System.out.println(read("/Users/tatyanakupreeva/Documents/io_tests/new_file_char.txt").toUpperCase());
        updateFile("/Users/tatyanakupreeva/Documents/io_tests/new_file_char.txt", " Как дела?", 5);
        printgenRandom("/Users/tatyanakupreeva/Documents/io_tests/random_file_char.txt", 2, 10, 20);
        sortNumber("/Users/tatyanakupreeva/Documents/io_tests/sort_char.txt");
        System.out.println(findText("/Users/tatyanakupreeva/Documents/io_tests/колобокRu.txt", "колобок"));
        System.out.println(findText("/Users/tatyanakupreeva/Documents/io_tests/Пушкин.txt", "я"));
        System.out.println(findText("/Users/tatyanakupreeva/Documents/io_tests/Пушкин.txt", "ты"));
        System.out.println(findText("/Users/tatyanakupreeva/Documents/io_tests/Пушкин.txt", "а"));
        System.out.println(findText("/Users/tatyanakupreeva/Documents/io_tests/Пушкин.txt", "и"));
        reverse("/Users/tatyanakupreeva/Documents/io_tests/Пушкин.txt", "/Users/tatyanakupreeva/Documents/io_tests/ПушкинReverse.txt");


    }
}
