package enumy;

public enum Rank {
    NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13), ACE(14);


    private int strength;

    private Rank(int strength) {
        this.strength = strength;
    }

    int getStrength() {
        return strength;
    }


}
