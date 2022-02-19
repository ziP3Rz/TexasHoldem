import models.Hand;
import models.deck.Card;
import models.deck.Deck;
import models.deck.Numbers;
import models.deck.Suits;

public class Main {
    public static void main(String[] args) {
        Deck Deck1 = new Deck();
        Deck1.showDeck();

        System.out.println();

        Card a = new Card(Numbers.AS, Suits.CLUBS);
        Card b = new Card(Numbers.SEVEN, Suits.SPADES);
        Card c = new Card(Numbers.SEVEN, Suits.HEARTS);
        Card d = new Card(Numbers.TWO, Suits.SPADES);
        Card e = new Card(Numbers.FOUR, Suits.SPADES);
        Hand aHand = new Hand(new Card[]{a,b,c,d,e});
        aHand.orderHand();
        aHand.showHand();
        System.out.println(aHand.isSuited() ? "Hay color" : "No hay color");
        System.out.println(aHand.isPair() ? "Hay pareja" : "No hay pareja");
    }
}
