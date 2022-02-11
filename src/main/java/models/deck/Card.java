package models.deck;

public class Card{
    private int num;
    private String suit;

    public Card() {
    }

    public Card(int num, String suit) {
        this.num = num;
        this.suit = suit;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
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
