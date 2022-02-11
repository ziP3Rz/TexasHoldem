package models.deck;

public enum Suits {

    SPADES ('S'),
    HEARTS ('H'),
    CLUBS ('C'),
    DIAMONDS ('D');

    private char sign;

    Suits(char sign) {
        this.sign = sign;
    }

    public char getSign() {
        return sign;
    }
}
