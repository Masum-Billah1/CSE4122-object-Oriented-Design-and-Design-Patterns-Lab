package Assignment7;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    private VendingMachineState state;
    private Map<String, Product> products;

    public VendingMachine(){
        this.products = new HashMap<>(0);
        this.state = new IdleState();
        initialProducts();
    }
    public void initialProducts(){
        products.put("Bread", new Product("Bread", 1.5, 5));
    }
    public void setState(VendingMachineState state){
        this.state = state;
    }
    public void insertdollar(){
        state.insertdollar(this);
    }
    public void ejectMoney() {
        state.ejectmoney(this);
    }
    public void dispanceIterm(){
        state.dispenseItem(this);
    }

    public void purchaseProduct(String productName){
        Product product = products.get(productName);

        if(product != null && product.getQuantity() > 0){
            product.decreasequantity();
            System.out.println("Product: " + product.getName()+ ", price: "+product.getPrice()+" Quantity: "+product.getQuantity());
        }
        else{
            System.out.println("Selected product is not available");
        }

    }
    public void displayAvailableProducts(){
        System.out.println("Available Products");

        for(Product product: products.values()){
            System.out.println(product.getName()+" -Quantity: "+product.getQuantity()+ " price: "+product.getPrice());
        }
    }
}
