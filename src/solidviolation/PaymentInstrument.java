package solidviolation;
//lislov substitution principle
public class PaymentInstrument {
    public void authenticatePaymentDetails(){
        System.out.println("Verifying payment details");
    }
    public void runFraudChecks(){
        System.out.println("Checks if any frauds are present");
    }
    public void collectPayment(){
        System.out.println("Amount Collected");
    }
}
