package solidviolation;

public class OrderViolation {
    public static void main(String[] args) {
//        OrderSaver orderSaver=new SaveToCloud();
//        OrderValidation orderNotification=new UserNotification();
        OrderProcessorBadCode orderProcessor=new OrderProcessorBadCode();
//        OrderSaver orderSaver=new SaveToCloud();//(orderValidator,orderSaver,orderNotification);
        orderProcessor.Process();
    }
}
