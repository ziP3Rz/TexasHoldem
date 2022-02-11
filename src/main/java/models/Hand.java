package models;

import models.deck.Card;
import models.deck.Hands;

public class Hand {

    private Card[] fullHand = new Card[5];
    private Hands matchedHand;
    private Card[] orderedHand;

    public void orderHand(){
        Card exchanger;
        for(int i = 1; i < fullHand.length; i++){
            for(int j = 0; j < fullHand.length - 1; j++){
                if(fullHand[j].getNum() > fullHand[i+1].getNum()){
                    exchanger = fullHand[j];
                    fullHand[j] = fullHand[j+1];
                    fullHand[j+1] = exchanger;
                }
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
