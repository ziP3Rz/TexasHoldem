package models.deck;

public class Card{
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
        return "Number: " + num + " | Suit: " + suit;
    }

    //TODO: implementar compareTo
    public int compareTo(Object o){
        return 0;
    }
}
