package solidcleancode;

import solidcleancode.notifier.OrderNotifier;
import solidcleancode.payment.CashOnDelivery;
import solidcleancode.payment.GooglePayPayment;
import solidcleancode.verification.OrderVerification;
import solidcleancode.verification.AddressVerification;
import solidcleancode.saver.OrderSaveToMysql;
import solidcleancode.saver.OrderSaver;
import solidcleancode.saver.OrderSavetoCloudDataBase;
import solidcleancode.notifier.OrderNotifyToCustomer;
import solidcleancode.payment.PaymentThroughUPI;
import solidcleancode.payment.PaymentMethod;



public class Order {
    public static void main(String[] args){
        OrderVerification orderVerification=new AddressVerification();
        OrderSaver orderSaver=new OrderSavetoCloudDataBase() ;
        OrderNotifier orderNotifier=new OrderNotifyToCustomer();
        OrderProcessor orderProcessor=new OrderProcessor(orderVerification,orderSaver,orderNotifier);

        orderProcessor.process();
        PaymentMethod paymentThroughUPI=new GooglePayPayment();
        PaymentMethod paymentthroughCash=new CashOnDelivery();
        paymentThroughUPI.paymentComplete();
        paymentthroughCash.paymentComplete();
    }
}
