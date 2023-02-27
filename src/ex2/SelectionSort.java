package ex2;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        int countCompare = 0;
        int countSwap = 0;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                countCompare++;
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            countSwap++;
            print(arr);
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
        System.out.println("Array Before Selection Sort");
        print(arr);
        selectionSort(arr);
        System.out.println("Array After Selection Sort");
        print(arr);
    }
}
