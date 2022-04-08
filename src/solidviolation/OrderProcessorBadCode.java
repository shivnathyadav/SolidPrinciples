package solidviolation;

public class OrderProcessorBadCode {
    OrderValidator orderValidator=new OrderValidator();
    OrderSaver orderSaver=new OrderSaver();
    OrderNotification orderNotification=new OrderNotification();
    public void Process() {
        orderValidator.Validate();
        orderSaver.DatabaseSaver();
        orderNotification.sendNotificatonToCustomer();
    }
}
