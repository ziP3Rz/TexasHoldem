package models.deck;

import java.util.concurrent.ThreadLocalRandom;

//TODO: implementar esta clase.
public class Deck {
    private final Card[] deck = new Card[52];

    public Deck() {
        createDeck();
    }

    private void createDeck() {
        for (int i = 0 ; i < deck.length; i++) {
            if ( i < 13 ) {
                deck[i] = new Card(Numbers.getNumbers(i), Suits.getSuits(0));
            } else if ( i < 26 ) {
                deck[i] = new Card(Numbers.getNumbers(i-13), Suits.getSuits(1));
            } else if ( i < 39 ) {
                deck[i] = new Card(Numbers.getNumbers(i-26), Suits.getSuits(2));
            } else {
                deck[i] = new Card(Numbers.getNumbers(i-39), Suits.getSuits(3));

            }
        }
    }

    public void showDeck() {
        for (Card card : deck) {
            System.out.println(card.toString());
        }
    }

    //TODO: implementar shuffle
    public void shuffle() {
        int randomPos;
        Card exchanger;
        for (int i = 0; i < deck.length; i++) {
            randomPos = ThreadLocalRandom.current().nextInt(0, deck.length);
            exchanger = deck[i];
            deck[i] = deck[randomPos];
            deck[randomPos] = exchanger;
        }

    }

    //TODO: implementar deal
    public Card[] deal(int cards) {
        Card[] hand = new Card[cards];
        for (int i = 0 , j = 0; i<cards; i++){
            if ( deck[i] != null ) {
                hand[j] = deck[i];
                deck[i] = null;
                j++;
            }
        }
        return hand;
    }
}
