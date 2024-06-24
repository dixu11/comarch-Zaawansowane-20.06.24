package enumy;

public class Card {
    private String suit;
    private Rank rank;

    public Card(String suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    int getStrength() {
       return rank.getStrength();
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}
