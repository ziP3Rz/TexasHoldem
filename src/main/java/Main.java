import models.Hand;
import models.deck.Card;
import models.deck.Deck;
import models.deck.Numbers;
import models.deck.Suits;

public class Main {
    public static void main(String[] args) {
        Deck Deck1 = new Deck();
        Deck1.showDeck();


        Card a = new Card(Numbers.AS, Suits.SPADES);
        Card b = new Card(Numbers.SEVEN, Suits.CLUBS);
        Card c = new Card(Numbers.THREE, Suits.SPADES);
        Card d = new Card(Numbers.THREE, Suits.HEARTS);
        Card e = new Card(Numbers.TWO, Suits.DIAMONDS);
        Hand aHand = new Hand(new Card[]{a,b,c,d,e});
        aHand.orderHand();
        aHand.showHand();
    }

}
