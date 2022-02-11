package models.deck;

public enum Hands {

    HIGH_CARD (0, 1),
    ONE_PAIR (1,2),
    TWO_PAIR (2, 4),
    THREE_OF_A_KIND (3, 3),
    STRAIGHT (4,5),
    FLUSH (5, 5),
    FULL_HOUSE (6, 5),
    FOUR_OF_A_KIND (7, 4),
    STRAIGHT_FLUSH (8, 5);


    private int value;
    private int cardsNumber;

    Hands(int value, int cardsNumber) {
        this.value = value;
        this.cardsNumber = cardsNumber;
    }

    public int getValue() {
        return value;
    }

    public int getCardsNumber() {
        return cardsNumber;
    }
}
