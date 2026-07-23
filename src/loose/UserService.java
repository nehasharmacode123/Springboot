//package loose;
//
//public class UserService {
//    NotificationService notificationService;
//
//    public UserService(NotificationService notificationService) {
//        this.notificationService = notificationService;
//    }
//
//    public void notifyUser(String message){
//        notificationService.send("Notification Hello");
//    }
//}

package loose;

public class UserService {
    NotificationService notificationService;

    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyUser(String message){
        notificationService.send("Notification Hello");
    }


    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }


}

