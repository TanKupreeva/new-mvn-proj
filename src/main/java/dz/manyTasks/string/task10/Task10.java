package dz.manyTasks.string.task10;

public class Task10 {
    public static void main(String[] args) {
        String str = "example.com";
        String str2 = "Example.com";
        StringBuffer sb = new StringBuffer(str);
        System.out.println(str.contentEquals(sb));
        System.out.println(str2.contentEquals(sb));
    }
}
