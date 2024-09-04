package Lesson4.LiskovSubstitutionPrinciple;

public class RupayCard extends CreditCard{
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
    public void intlPayment() {
 // it is not supported in india but still we need to implement
    }

    @Override
    public void upiPayment() {

    }
}
