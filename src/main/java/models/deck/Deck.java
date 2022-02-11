package models.deck;
//TODO: implementar esta clase.
public class Deck {
    private final Card[] deck = new Card[52];

    public Deck(){
        createDeck();
    }

    private void createDeck(){
        for (int i = 0; i < deck.length; i++){
            if(i < 13){
                deck[i] = new Card((i+1)%13,"Spades");
            }else if(i < 26){
                deck[i] = new Card((i+1)%13,"Hearts");
            }else if(i < 39){
                deck[i] = new Card((i+1)%13, "Clubs");
            }else{
                deck[i] = new Card((i+1)%13, "Diamonds");
            }
        }
    }

    public void showDeck(){
        for (Card card:deck) {
            System.out.println(card.toString());
        }
    }

    //TODO: implementar shuffle
    public void shuffle(){

    }

    //TODO: implementar deal
    public Card[] deal(int cards){
        Card[] hand = new Card[cards];
        return hand;
    }
}
