import java.util.List;

public class Main {
    public static void main(String[] args) {
        String warehousePassword = "********"; // Password for the Warehouse
        String enteredUsername = "masum_billah"; // Entered username for authentication
        String enteredPassword = "********"; // Entered password for authentication

        OrderFulfillmentProxy orderFulfillmentProxy = new OrderFulfillmentProxy(warehousePassword, enteredUsername, enteredPassword);

        Item buyComputer = new Item("Computer");
        Item buyTelevision = new Item("Television");

        Order order = new Order(List.of(buyComputer, buyTelevision));

        orderFulfillmentProxy.fulfillOrder(order);
    }
}
