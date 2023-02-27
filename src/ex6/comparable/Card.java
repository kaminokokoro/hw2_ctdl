package ex6.comparable;

public class Card implements Comparable<Card> {
    private int rank;
    private int suit;

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public int getSuit() {
        return suit;
    }

    public String toString() {
        return "Rank: " + rank + " Suit: " + suit+"\n";
    }

    @Override
    public int compareTo(Card o) {
        if (rank != o.rank) {
            return rank - o.rank;
        }else {
            return suit - o.suit;
        }
    }
}
