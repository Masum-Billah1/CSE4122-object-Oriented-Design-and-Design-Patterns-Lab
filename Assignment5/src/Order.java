import java.util.List;

class Order {
    private List<Item> itemList;

    public Order(List<Item> itemList) {
        this.itemList = itemList;
    }

    public List<Item> getItemList() {
        return itemList;
    }
}
