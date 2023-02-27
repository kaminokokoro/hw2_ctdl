package ex5;

public class BubbleSortGeneric {
    public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
        int n = arr.length;
        T temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1].compareTo(arr[j]) > 0) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
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
        System.out.println("Array Before Bubble Sort");
        print(arr);
        bubbleSort(arr);
        System.out.println("Array After Bubble Sort");
        print(arr);
    }
}
