package solidcleancode.payment;

public interface PaymentThroughUPI extends PaymentMethod{
    public void authenticateUpiDetails();
    public void checkFraud();
}
