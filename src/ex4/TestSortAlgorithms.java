package ex4;

import ex1.BubbleSort;
import ex2.SelectionSort;
import ex3.InsertionSort;

public class TestSortAlgorithms {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 35, 45, 60, 320};
        System.out.println("Array Before Bubble Sort");
        BubbleSort.print(arr);
        BubbleSort.bubbleSort(arr);
        System.out.println("Array After Bubble Sort");
        BubbleSort.print(arr);
        System.out.println("Array Before Selection Sort");
        SelectionSort.print(arr);
        SelectionSort.selectionSort(arr);
        System.out.println("Array After Selection Sort");
        SelectionSort.print(arr);
        System.out.println("Array Before Insertion Sort");
        InsertionSort.print(arr);
        InsertionSort.insertionSort(arr);
        System.out.println("Array After Insertion Sort");
        InsertionSort.print(arr);
    }
}
