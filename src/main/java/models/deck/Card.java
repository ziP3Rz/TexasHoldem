package models.deck;

import java.util.Objects;

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
        return "Number: " + this.getNum().getSign() + " | Suit: " + this.getSuit().getSign();
    }


    @Override
    public int compareTo(Card o) {
        if ( this == o ) return 1;
        return Integer.compare(o.num.getValue(), this.num.getValue());
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( !(o instanceof Card) ) return false;
        return this.getNum() == ((Card) o).getNum();
    }


}
