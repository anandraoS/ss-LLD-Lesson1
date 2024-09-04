package Lesson2.OpenClosePrinciple.Example1.bettercode;

public class SMSNotification implements  Notification{
    @Override
    public void send() {
        System.out.println("sending sms notfication");
    }
}
