package Lesson2.OpenClosePrinciple.Example1.bettercode;



import java.util.List;

public class NotifiactionSender {
    public void sendNotification(List<Notification> notifications){
        for (Notification type: notifications){
           type.send();
        }
    }
}
