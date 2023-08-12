package dz.manyTasks.interfaces.task11;

public interface Sortable {
    void sort(int[] array);
}

class QuickSort implements Sortable {

    @Override
    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(array, low, high);
            quickSort(array, low, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, high);
        }
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] >= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }
}


class MergeSort implements Sortable {

    @Override
    public void sort(int[] array) {

    }
}

class Main {
    public static void main(String[] args) {
        int[] arr = {
                9,
                5,
                2,
                8,
                0,
                3,
                1,
                6
        };

        Sortable quickSort = new QuickSort();
        quickSort.sort(arr);
        System.out.print("Quick Sort (Descending Order): ");
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}