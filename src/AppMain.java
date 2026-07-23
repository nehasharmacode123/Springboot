import loose.EmailNotificationService;
import loose.NotificationService;
import loose.SMSEmailNotificationService;
import tight.UserService;

public class AppMain {
    public static void main(String[] args){

        // tight coupling
        UserService userService = new UserService();
        userService.notifyUser("Order Placed!");

        // loose coupling
        NotificationService emailService = new EmailNotificationService();
        NotificationService smsService = new SMSEmailNotificationService();
        loose.UserService userServiceLoose = new loose.UserService(smsService);
        userServiceLoose.notifyUser("Order Processed!");

       /*
       Constructor Injection - dependency is provide via contructor
       Setter Injection - dependency is provided via setter method
       Field Injection - dependency is assigned directly to a field
       */
    }
}