package models;

import models.deck.Card;
import models.deck.Hands;

public class Hand {

    private Card[] fullHand = new Card[5];
    private Hands matchedHand;
    private Card[] orderedHand;

    public void orderHand(){
        Card exchanger = fullHand[0];
        for(int i = 1; i < fullHand.length; i++){
            if(exchanger.getNum() > fullHand[i].getNum()){
                fullHand[i-1] = fullHand[i];
                //fullHand[i];
            }
        }
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
}
