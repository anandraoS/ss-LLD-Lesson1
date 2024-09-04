package Lesson2.OpenClosePrinciple.Example1.bettercode;

public class WhatsappNotification implements Notification{
    @Override
    public void send() {
        System.out.println("Sending Whatsapp Notification");
    }
}
