package solidcleancode.verification;

public class AddressVerification implements OrderVerification{
    @Override
    public void verify() {
        System.out.println("Address Verified");
    }
}
