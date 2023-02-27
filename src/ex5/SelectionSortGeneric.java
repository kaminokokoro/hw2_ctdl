package ex5;

public class SelectionSortGeneric {
    public static <T extends Comparable<T>> void selectionSort(T[] arr) {
        int n = arr.length;
        T temp;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[min]) < 0) {
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static <T> void print(T[] arr) {
        for (T t : arr) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] arr = { 3, 60, 35, 2, 45, 320, 5 };
        System.out.println("Array Before Selection Sort");
        print(arr);
        selectionSort(arr);
        System.out.println("Array After Selection Sort");
        print(arr);
    }
}
