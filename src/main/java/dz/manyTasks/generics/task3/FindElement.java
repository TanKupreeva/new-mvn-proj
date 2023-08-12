package dz.manyTasks.generics.task3;

public class FindElement {
    public static <T> int find(T[] arr, T text) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(text))
                return i;
        }
        return -1;
    }


    public static void main(String[] args) {
        Integer[] integers = {0, 1, 2, 3, 4};
        System.out.println("index of array simbol 1 is : " + find(integers, 1));
        String[] strings={"one","two","three","four"};
        System.out.println("index of array simbol \"one\" is : "+find(strings,"one"));
    }
}

