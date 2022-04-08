package solidcleancode.saver;

public class OrderSavetoCloudDataBase implements OrderSaver{
    @Override
    public void save() {
        System.out.println("Order saved on cloud Database");
    }
}
