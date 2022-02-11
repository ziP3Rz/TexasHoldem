package models.deck;

public enum Numbers {

    TWO (1, "2"),
    THREE (2, "3"),
    FOUR (3, "4"),
    FIVE (4, "5"),
    SIX (5, "6"),
    SEVEN (6, "7"),
    EIGHT (7, "8"),
    NINE (8, "9"),
    TEN (9, "10"),
    JACK (10, "J"),
    QUEEN (11, "Q"),
    KING (12, "K"),
    AS (13, "A");



    private int value;
    private String sign;

    Numbers(int value, String sign) {
        this.value = value;
        this.sign = sign;
    }

    public int getValue() {
        return value;
    }

    public String getSign() {
        return sign;
    }
}
