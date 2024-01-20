package Assignment7;

public class HasOneDollarState implements VendingMachineState{

    @Override
    public void insertdollar(VendingMachine vendingMachine) {
        System.out.println("Only One dolar is inserted");
    }

    @Override
    public void ejectmoney(VendingMachine vendingMachine) {
        System.out.println("Money ejected");
        vendingMachine.setState((VendingMachineState) new IdleState());
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Item Dispensed");
        vendingMachine.setState((VendingMachineState) new IdleState());
    }
}
