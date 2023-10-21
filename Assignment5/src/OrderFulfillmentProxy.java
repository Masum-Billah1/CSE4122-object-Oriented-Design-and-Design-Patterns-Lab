import java.util.List;

class OrderFulfillmentProxy implements IOrder {
    private Warehouse warehouse;
    private UserAuthentication userAuthentication;

    public OrderFulfillmentProxy(String warehousePassword, String enteredUsername, String enteredPassword) {
        this.warehouse = new Warehouse();
        this.userAuthentication = new UserAuthentication("masum_billah", warehousePassword);

        if (userAuthentication.authenticate(enteredUsername, enteredPassword)) {
            System.out.println("User authorized.");
        } else {
            System.out.println("User authentication failed. Not authorized.");
        }
    }

    public void fulfillOrder(Order order) {
        if (userAuthentication != null && userAuthentication.isAuthenticated()) {
            warehouse.fulfillOrder(order);
        } else {
            System.out.println("User is not authorized to place orders.");
        }
    }
}
