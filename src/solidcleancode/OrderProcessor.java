package solidcleancode;
import solidcleancode.notifier.OrderNotifier;
import solidcleancode.verification.OrderVerification;
import solidcleancode.saver.OrderSaver;

public class OrderProcessor {

    OrderVerification orderVerfication;
    OrderSaver orderSaver;
    OrderNotifier orderNotifier;
    public OrderProcessor(OrderVerification orderVerfication,OrderSaver orderSaver,OrderNotifier orderNotifier){
        this.orderVerfication=orderVerfication;
        this.orderSaver=orderSaver;
        this.orderNotifier=orderNotifier;
    }
    public void process(){
        orderVerfication.verify();
        orderSaver.save();
        orderNotifier.sendNotificationToCustomer();
    }
}
