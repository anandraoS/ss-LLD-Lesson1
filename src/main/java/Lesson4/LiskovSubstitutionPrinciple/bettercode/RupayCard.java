package Lesson4.LiskovSubstitutionPrinciple.bettercode;

public class RupayCard extends CreditCard implements  UPICmpatableCreditCard{
    @Override
    public void tapandPay() {
        System.out.println("Tap and PAy impl of RUPAY ");
    }

    @Override
    public void oinlineTransfer() {
        System.out.println("Olinee transfer impl of RUPAY ");
    }

    @Override
    public void swipeandPay() {
        System.out.println("Swipe and PAy impl of RUPAY ");
    }

    @Override
    public void mandatePayments() {
        System.out.println("Mandate Pay impl of RUPAY ");
    }



    @Override
    public void upiPayment() {

    }
}
