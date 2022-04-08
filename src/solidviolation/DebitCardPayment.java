package solidviolation;

public class DebitCardPayment extends PaymentInstrument{
    @Override
    public void authenticatePaymentDetails() {
        System.out.println("Payment details authenticated");
    }
    @Override
    public void runFraudChecks(){
        System.out.println("Checks fraud activities");
    }
    @Override
    public void collectPayment() {
        System.out.println("Payment done online");
    }
}
