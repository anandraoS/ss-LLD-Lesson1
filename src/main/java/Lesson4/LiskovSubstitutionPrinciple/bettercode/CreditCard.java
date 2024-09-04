package Lesson4.LiskovSubstitutionPrinciple.bettercode;

public abstract class CreditCard {

    private String cardNumber;
    private String ownerName;
    private int cvv;

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public abstract  void tapandPay();

    public abstract void oinlineTransfer();

    public abstract void swipeandPay() ;

    public abstract void mandatePayments() ;

    public void displayCardDetails() {
        System.out.println("creditCard Number:" + this.cardNumber + " owner Name: " + this.ownerName);
    }
}
