package Lesson4.LiskovSubstitutionPrinciple.bettercode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String sf[]){

        List<InternationalPaymentCompatableCreditCard> cards =  new ArrayList<>();
        for (InternationalPaymentCompatableCreditCard card: cards){
           card.intlPayment();
        }
    }
}
