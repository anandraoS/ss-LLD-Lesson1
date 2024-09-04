package Lesson2.OpenClosePrinciple.Example1.bettercode;

public class EmailNotification implements  Notification{
    @Override
    public void send() {
        System.out.println("Sending Email Notification");
    }
}
