package models.deck;
//TODO: implementar esta clase.
public class Deck {
    private Card[] deck = new Card[52];
    /*
    public void createDeck(){
        for (int i = 0; i < deck.length; i++){
            if(i < 13){
                deck[i] = new Card((i+1)%13,'P');
            }else if(i < 26){
                deck[i] = new Card((i+1)%13,'C');
            }else if(i < 39){
                deck[i] = new Card((i+1)%13, 'T');
            }else{
                deck[i] = new Card((i+1)%13, 'D');
            }
        }
    }
    */
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
