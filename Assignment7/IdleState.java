package Assignment7;

public class IdleState implements VendingMachineState{
    @Override
    public void insertdollar(VendingMachine vendingMachine) {
        System.out.println("Dolar Inserted. Moving to HasOneDollarState");
        vendingMachine.setState(new HasOneDollarState());
    }

    @Override
    public void ejectmoney(VendingMachine vendingMachine) {
        System.out.println("No money to eject");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Insert a dolar first");
    }
}
