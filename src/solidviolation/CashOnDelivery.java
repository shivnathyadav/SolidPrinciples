package solidviolation;

public class CashOnDelivery extends PaymentInstrument {
    @Override
    public void authenticatePaymentDetails() {
        System.out.println("Authentication not required");
    }
    @Override
    public void runFraudChecks() {
        System.out.println("No fraud activities");
    }
    @Override
    public void collectPayment() {
        System.out.println("Payment done offline");
    }
}