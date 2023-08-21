package dz.manyTasks.string.task11;

public class Task11 {
    public static void main(String[] args) {
        char[] arr_num = new char[] { '1', '2', '3', '4' };

        // Create a String containig the contents of arr_num
        // starting at index 1 for length 2.
        String str = String.copyValueOf(arr_num, 1, 3);

        // Display the results of the new String.
        System.out.println("The book contains " + str +" pages.");
    }
}
