package Lesson2.OpenClosePrinciple.Example1;

import java.util.List;

public class NotifiactionSender {
    public void sendNotification(List<NotificationType> notifications){
        for (NotificationType type: notifications){
            if(type == NotificationType.SMS)
                type.sendSMSNotification();
            else if(type == NotificationType.EMAIL)
                type.sendEmailNotification();
            else if(type == NotificationType.WHATSAPP)
                type.sendWhatsappNotification();
        }
    }
}
