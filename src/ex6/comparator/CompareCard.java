package ex6.comparator;

import java.util.*;

public class CompareCard {
    public static void main(String[] args) {
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
        System.out.println("Before sort:");
        for (Card card : cards) {
            System.out.println(card);
        }

        Collections.sort(cards, new Comparator<Card>() {
            public int compare(Card c1, Card c2) {
                if (c1.getRank() == c2.getRank()) {
                    return c1.getSuit() - c2.getSuit();
                } else {
                    return c1.getRank() - c2.getRank();
                }
            }
        });

        System.out.println("After sort:");
        for (Card c : cards) {
            System.out.println(c);
        }
    }

}
