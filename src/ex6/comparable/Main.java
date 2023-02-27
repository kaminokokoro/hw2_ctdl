package ex6.comparable;

import ex2.SelectionSort;
import ex5.*;

public class Main {
    public static void main(String[] args) {
        Card[] cards = new Card[52];
        int index = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 13; j++) {
                cards[index] = new Card(j, i);
                index++;
            }
        }
        shuffle(cards);
        System.out.println("Array After Bubble Sort");
        BubbleSortGeneric.bubbleSort(cards);
        BubbleSortGeneric.print(cards);

        shuffle(cards);
        System.out.println("Array After Insertion Sort");
        InsertionSortGeneric.insertionSort(cards);
        InsertionSortGeneric.print(cards);

        shuffle(cards);
        System.out.println("Array After Selection Sort");
        SelectionSortGeneric.selectionSort(cards);
        SelectionSortGeneric.print(cards);

    }

    public static void shuffle(Card[] cards) {
        for (int i = 0; i < cards.length; i++) {
            int r = (int) (Math.random() * cards.length);
            Card temp = cards[i];
            cards[i] = cards[r];
            cards[r] = temp;
        }
    }

}
