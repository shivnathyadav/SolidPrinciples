package solidcleancode.saver;

public class OrderSaveToMysql implements OrderSaver{
    @Override
    public void save() {
        System.out.println("Order save to Mysql Database");
    }
}
