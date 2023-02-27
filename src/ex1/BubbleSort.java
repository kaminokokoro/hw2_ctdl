package ex1;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        int countCompare = 0;
        int countSwap = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                countCompare++;
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
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
        System.out.println("Array Before Bubble Sort");
        print(arr);
        bubbleSort(arr);
        System.out.println("Array After Bubble Sort");
        print(arr);
    }
}
