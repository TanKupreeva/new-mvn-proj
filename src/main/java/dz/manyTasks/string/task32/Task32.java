package dz.manyTasks.string.task32;

public class Task32 {
    public static void main(String[] args) {
        String str = "thequickbrownfoxxofnworbquickthe";
        char[] a = str.toCharArray();
        StringBuffer sb = new StringBuffer(str);

        System.out.println(sb.reverse());
        String str2 = sb.toString();
        char[] b = str2.toCharArray();
        StringBuffer polindrom = new StringBuffer();
        String otvet = "";


        for (int i = 0, k = 0; i < str.length(); k++) {
            for (int j = 0; j < sb.length(); j++) {
                if (a[i] == b[j]) {
                    if (i < a.length - 1) {
                        polindrom = polindrom.append(a[i]);

                        if (otvet.length() <= polindrom.length()) {
                            otvet = polindrom.toString();
                        }
                        i++;
                    }
                } else {
                    polindrom = polindrom.delete(0, j);
                    i = k;
                }
            }
            if (k == str.length()-1) {
                break;
            }
        }

        System.out.println("Polindrom: " + otvet + "  length = " + otvet.length());


    }
}
