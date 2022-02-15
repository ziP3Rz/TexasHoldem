package models;

import models.deck.Card;

public class Player {
    private int bank;
    private int gamePosition;
    private Card[] playerHand = new Card[2];
    private int actualBet;


    public void callBet(int bet){
       if ( this.bank >= bet ){
           this.bank = this.bank - bet;
           this.actualBet = bet;
           System.out.println("Apuesta Igualada");
       } else System.out.println("Bank insuficiente, si quieres apostar realiza un all-in");
    }

    public boolean riseBet(int amount){
        if ( this.bank >= amount ){
            this.bank = this.bank - amount;
            this.actualBet = amount;
            return true;
        } else return false;
    }

    public void check(){
    }

    public void fall(){
    }

    public int getBank() {
        return bank;
    }

    public void setBank(int bank) {
        this.bank = bank;
    }

    public void showHand(){
        for (Card card : playerHand) {
            System.out.println(card.toString());
        }
    }

    //TODO:Igualar, Subir, Irse, Pasar


}
