package ex3;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        int countCompare = 0;
        int countSwap = 0;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                countCompare++;
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    countSwap++;
                }
                print(arr);
            }
        }
        System.out.println("Compare: " + countCompare);
        System.out.println("Swap: " + countSwap);
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 3, 60, 35, 2, 45, 320, 5 };
        System.out.println("Array Before Insertion Sort");
        print(arr);
        insertionSort(arr);
        System.out.println("Array After Insertion Sort");
        print(arr);
    }
}
