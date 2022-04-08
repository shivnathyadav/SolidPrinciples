package solidcleancode.payment;

public class GooglePayPayment implements PaymentThroughUPI{
    @Override
    public void authenticateUpiDetails() {
       System.out.println("UPI details verified");
    }

    @Override
    public void checkFraud() {
      System.out.println("Check if any fraud happens or not");
    }
    @Override
    public void paymentComplete() {
        authenticateUpiDetails();
        checkFraud();
        System.out.println("Payment completed through UPI");

    }

}
