package solidviolation;

//single-responsibility
public class OrderProcessorViolation {
    public void Validate(){
        System.out.println("Order validated");
    }
    public void Saver(){
        System.out.println("Order Saver");
    }
    public void Notification(){
        System.out.println("Order Notified");
    }
}
