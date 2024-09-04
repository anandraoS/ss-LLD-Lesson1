package Lesson4.LiskovSubstitutionPrinciple.bettercode;

public class VIsaCard extends CreditCard implements InternationalPaymentCompatableCreditCard{
    @Override
    public void tapandPay() {
        System.out.println("Tap and PAy impl of VISA ");
    }

    @Override
    public void oinlineTransfer() {
        System.out.println("Olinee transfer impl of VISA ");
    }

    @Override
    public void swipeandPay() {
        System.out.println("Swipe and PAy impl of VISA ");
    }

    @Override
    public void mandatePayments() {
        System.out.println("Mandate Pay impl of VISA ");
    }

    @Override
    public void intlPayment() {

    }

}
