package chapter4Exercises;

public class Card {


        private final String face;
        private final String suit;

        public Card (String cardFace, String cardSuit){
            this.face = cardFace;
            this.suit = cardSuit;
        }

        public String toString() {

            return face + " of " + suit;
        }
        
    public static void main(String[] args) {
        Card card = new Card("bobby", "jack");
        System.out.println(card.toString());
        System.out.println(card);

        Card card2 = new Card("sir", "bobby");
        System.out.println(card2);
    }

}
