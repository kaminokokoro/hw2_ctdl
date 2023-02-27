package ex5;

public class InsertionSortGeneric {
    public static <T extends Comparable<T>> void insertionSort(T[] arr) {
        int n = arr.length;
        T temp;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j].compareTo(arr[j - 1]) < 0) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
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
        System.out.println("Array Before Insertion Sort");
        print(arr);
        insertionSort(arr);
        System.out.println("Array After Insertion Sort");
        print(arr);
    }

}
