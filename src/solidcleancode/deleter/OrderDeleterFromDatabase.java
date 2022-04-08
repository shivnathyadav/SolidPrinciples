package solidcleancode.deleter;

public class OrderDeleterFromDatabase implements OrderCancel{
    @Override
    public void cancelTheOrder() {
        System.out.println("Order Cancelled Successfully");
    }

    @Override
    public void deleteOrderFromDb() {
      cancelTheOrder();
      System.out.println("Order deleted from database");
    }
}
