package ex7;

import ex6.comparator.Card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Random {
    public static int random(int n) {
        return (int) (Math.random() * n);
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int temp = random(20);
            while (contains(arr, temp)) {
                temp = random(20);
            }
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        List<Card> cards = new ArrayList<Card>(List.of(
                new Card(1, 1),
                new Card(1, 2),
                new Card(1, 3),
                new Card(1, 4),
                new Card(2, 1),
                new Card(2, 2),
                new Card(2, 3),
                new Card(2, 4),
                new Card(3, 1),
                new Card(3, 2),
                new Card(3, 3),
                new Card(3, 4),
                new Card(4, 1),
                new Card(4, 2),
                new Card(4, 3),
                new Card(4, 4),
                new Card(5, 1),
                new Card(5, 2),
                new Card(5, 3),
                new Card(5, 4),
                new Card(6, 1),
                new Card(6, 2),
                new Card(6, 3),
                new Card(6, 4),
                new Card(7, 1),
                new Card(7, 2),
                new Card(7, 3),
                new Card(7, 4),
                new Card(8, 1),
                new Card(8, 2),
                new Card(8, 3),
                new Card(8, 4),
                new Card(9, 1),
                new Card(9, 2),
                new Card(9, 3),
                new Card(9, 4),
                new Card(10, 1),
                new Card(10, 2),
                new Card(10, 3),
                new Card(10, 4),
                new Card(11, 1),
                new Card(11, 2),
                new Card(11, 3),
                new Card(11, 4),
                new Card(12, 1),
                new Card(12, 2),
                new Card(12, 3),
                new Card(12, 4),
                new Card(13, 1),
                new Card(13, 2),
                new Card(13, 3),
                new Card(13, 4)
        ));

        Collections.shuffle(cards);
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    public static boolean contains(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return true;
            }
        }
        return false;
    }
}




