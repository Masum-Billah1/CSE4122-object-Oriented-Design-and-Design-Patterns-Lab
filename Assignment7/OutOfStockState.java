package Assignment7;

public class OutOfStockState implements VendingMachineState{
    @Override
    public void insertdollar(VendingMachine vendingMachine) {
        System.out.println("Out of stock");
    }

    @Override
    public void ejectmoney(VendingMachine vendingMachine) {
        System.out.println("Don't allow money eject");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Out of stock. Prduct can't be dispensed");
    }
}
