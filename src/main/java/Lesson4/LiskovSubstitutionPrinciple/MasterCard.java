package Lesson4.LiskovSubstitutionPrinciple;

public class MasterCard extends CreditCard{
    @Override
    public void tapandPay() {
        System.out.println("Tap and PAy impl of MASTER ");
    }

    @Override
    public void oinlineTransfer() {
        System.out.println("Olinee transfer impl of MASTER ");
    }

    @Override
    public void swipeandPay() {
        System.out.println("Swipe and PAy impl of MASTER ");
    }

    @Override
    public void mandatePayments() {
        System.out.println("Mandate Pay impl of MASTER ");
    }
}
