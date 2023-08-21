package dz.manyTasks.string.task9;

public class Task9 {
    public static void main(String[] args) {
        String str = "Example.com";
        String str2 = "example.com";
        System.out.println(str.contentEquals("example.com"));
        System.out.println(str2.contentEquals(".com"));
    }
}
