package solidcleancode.payment;

public class CashOnDelivery implements PaymentMethod{
    @Override
    public void paymentComplete() {
        System.out.println("Payment completed through Cash on delivery");
    }
}
