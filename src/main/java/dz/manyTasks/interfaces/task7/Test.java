package dz.manyTasks.interfaces.task7;

import java.util.Arrays;

public class Test {
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 4, 3, 45, 54, 35, 7};
        printArray(array);
        BubbleSort bs = new BubbleSort();
        bs.sort(array);
        printArray(array);
        SelectionSort ss = new SelectionSort();
        ss.sort(array);
        printArray(array);
    }
}
