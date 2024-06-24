package enumy;

public class Demo {
    public static void main(String[] args) {
        Card card1 = new Card("trefl", Rank.ACE);
        Card card2 = new Card("kier", Rank.TEN);
        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card1.getStrength());
        System.out.println(card2.getStrength());


    }
}
