package tight;
import tight.NotificationService;

public class UserService {
    public void notifyUser(String message){
        tight.NotificationService notificationService = new NotificationService();
        notificationService.send("Notification Hello");
    }
}