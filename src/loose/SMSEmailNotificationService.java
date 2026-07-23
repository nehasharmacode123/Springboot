//package loose;
//
//public class EmailNotificationService implements NotificationService {
//
//    @Override
//    public void send(String message) {
//        System.out.println("Email: " + message);
//    }
//}

package loose;

public class SMSEmailNotificationService implements NotificationService {

    @Override
    public void send(String message) {

        System.out.println("SMS: " + message);
    }
}
