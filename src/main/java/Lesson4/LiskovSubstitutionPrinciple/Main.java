package Lesson4.LiskovSubstitutionPrinciple;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String sf[]){

        List<CreditCard> cards =  new ArrayList<>();
        for (CreditCard card: cards){
            if(card instanceof RupayCard)
                card.upiPayment();
        }
    }
}
