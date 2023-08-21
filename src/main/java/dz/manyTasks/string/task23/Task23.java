package dz.manyTasks.string.task23;

public class Task23 {
    public static void main(String[] args) {
        String str1 = "Red Green Orange Yellow";
        String str2 = "Yellow Orange Green Red";
        System.out.println(str2.indexOf("Red"));
        boolean m = str1.regionMatches(0,str2,20,3);
        System.out.println(m);


        String str3 = "Shanghai Houston Colorado Alexandria";
        String str4 = "Alexandria Colorado Houston Shanghai";
        boolean m2 = str3.regionMatches(str3.indexOf("Houston"),str4,str4.indexOf("Houston"),7);
        System.out.println(m2);

    }
}
