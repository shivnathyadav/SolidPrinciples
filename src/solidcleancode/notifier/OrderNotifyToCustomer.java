package solidcleancode.notifier;

public class OrderNotifyToCustomer implements OrderNotifier{
    @Override
    public void sendNotificationToCustomer() {
        System.out.println("Notification is successfully sent to customer");
    }
}
