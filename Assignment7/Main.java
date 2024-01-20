package Assignment7;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.displayAvailableProducts();
        System.out.println();
        vendingMachine.insertdollar();
        vendingMachine.purchaseProduct("Bread");
        vendingMachine.purchaseProduct("Bread");
    }
}
