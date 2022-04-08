package solidviolation;

//open-closed principle
public class OrderSaver {
    public void DatabaseSaver(){
        System.out.println("Order saved to database");
    }
    public void CloudSaver(){
        System.out.println("Order saved to cloud");
    }
    public void delete(){
        System.out.println("Order deleted");
    }
}
