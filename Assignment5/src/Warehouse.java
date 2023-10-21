import java.util.Hashtable;

class Warehouse implements IOrder {
    private Hashtable<String, Integer> stock;

    public Warehouse() {
        this.stock = new Hashtable<>(); // Initialize the stock Hashtable
        stock.put("Bike", 5);
        stock.put("Computer", 10);
        stock.put("Television", 8);
    }

    public void fulfillOrder(Order order) {
        for (Item item : order.getItemList()) {
            System.out.println("Order fulfilled: " + item.getItemName());
            String key = item.getItemName();
            int currentValue = stock.get(key);
            int newValue = currentValue - 1;
            stock.put(key, newValue);
            System.out.println("Remaining: " + stock);
        }
    }
}
