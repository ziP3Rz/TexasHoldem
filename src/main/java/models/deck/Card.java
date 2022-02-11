package models.deck;

public class Card implements Comparable<Card>{
    private Numbers num;
    private Suits suit;

    public Card() {
    }

    public Card(Numbers num, Suits suit) {
        this.num = num;
        this.suit = suit;

    }

    public Numbers getNum() {
        return num;
    }

    public void setNum(Numbers num) {
        this.num = num;
    }

    public Suits getSuit() {
        return suit;
    }

    public void setSuit(Suits suit) {
        this.suit = suit;
    }

    @Override
    public String toString(){
        return "Number: " + this.getNum().getValue() + " | Suit: " + this.getNum().getSign();
    }

    //TODO: implementar compareTo

    @Override
    public int compareTo(Card o) {
        return 0;
    }

}
