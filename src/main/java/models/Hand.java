package models;

import models.deck.Card;
import models.deck.Hands;

import java.util.Arrays;

public class Hand {

    private Card[] fullHand = new Card[5];
    private Hands matchedHand;
    private Card[] orderedHand;

    public Hand(Card[] fullHand) {
        this.fullHand = fullHand;
    }

    public void showHand(){
        for(Card card: fullHand){
            System.out.println(card.toString());
        }
    }

    public void orderHand(){
        Arrays.sort(fullHand);
    }

    //TODO: implementar este método: devolverá -1 en caso de que la mano invocante sea peor que la mano pasada como parámetro, 1 en caso contrario y 0 en caso de que sean iguales (equivalentes en valor).
    public int compareTo(Hand otherHand){
        if(this.matchedHand.equals(otherHand.matchedHand)){
            return 0;
        }
        if((this.matchedHand.getValue() == otherHand.matchedHand.getValue())){
            //if()
        }
        if(this.matchedHand.getValue() < otherHand.matchedHand.getValue()){
            return -1;
        }
        return 1;
    }
    /*
    public Hands matchCards(){
        if(isPair())
    }*/

    public boolean isPair(){
        return true;//TODO: comprobar si hay dos iguales
    }

    public boolean isThreeOfKind(){
        if(isPair()){
            return true;//TODO: comprobar si hay una tercera igual
        }else{
            return false;
        }
    }

    public boolean isFourOfKind(){
        if(isThreeOfKind()){
            return true;//TODO: comprobar si hay una cuarta igual
        }else{
            return false;
        }
    }

    public boolean isFullHouse(){
        if(isThreeOfKind() && isPair()){
            return !isFourOfKind();
        }else{
            return false;
        }
    }

    public boolean isTwoPair(){
        if(isPair()){
            return true;//TODO: comprobar si hay otra pareja
        }else{
            return false;
        }
    }

    public boolean isStraight(){
        if(!isPair()){
            return true;//TODO: comprobar si hay escalera
        }else{
            return false;
        }
    }

    public boolean isSuited(){
        if(!isPair()){
            for (int i = 0; i < fullHand.length; i++) {
                if(!fullHand[i].getSuit().equals(fullHand[i+1].getSuit())){
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }
    }
}
