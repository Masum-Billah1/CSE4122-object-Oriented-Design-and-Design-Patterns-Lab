import java.math.BigDecimal;
import java.util.Scanner;

public class Customer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();
        BankService bankService = new BankService();
        int choice;
        Double Saving_amount = 0.0;
        Double Investment_amount = 0.0;
        Double Transfer_Amount = 0.0;
        Double Deposite_Amount = 0.0;


        System.out.print("Enter the amount for initial deposit to create Saving account: ");
        Saving_amount = input.nextDouble();
        int mySavingsAccount = bankService.createNewAccount("savings", new BigDecimal(Saving_amount));
        BigDecimal mySavingsAccountBalance = bankService.showBalance(mySavingsAccount);
        System.out.println("My Savings Account Balance is: " + mySavingsAccountBalance);

        System.out.print("Enter the amount for initial deposit to create Investment account: ");
        Investment_amount = input.nextDouble();
        int myInvestmentAccount = bankService.createNewAccount("investment", new BigDecimal(Investment_amount));
        BigDecimal myInvestmentAccountBalance = bankService.showBalance(myInvestmentAccount);
        System.out.println("My Investment Account Balance is: " + myInvestmentAccountBalance);

        System.out.println("Enter what do you want");
        System.out.println("Press 1: Transfer");
        System.out.println("Press 2: Deposit");
        System.out.print("Press: ");
        choice = input.nextInt();
        if(choice == 1) {
            System.out.print("Enter the amount to transfer: ");
            Transfer_Amount = input.nextDouble();
            bankService.transferMoney(myInvestmentAccount, mySavingsAccount, new BigDecimal(Transfer_Amount));
            myInvestmentAccountBalance = bankService.showBalance(myInvestmentAccount);
            mySavingsAccountBalance = bankService.showBalance(mySavingsAccount);
            System.out.println("My Savings Account Balance after transection is: " + mySavingsAccountBalance);
            System.out.println("My Investment Account Balance after transection is: " + myInvestmentAccountBalance);;
        }
        if (choice == 2) {
            System.out.print("Enter the amount to deposit: ");
            Deposite_Amount = input.nextDouble();
            bankService.deposit(mySavingsAccount, new BigDecimal(Deposite_Amount));
            mySavingsAccountBalance = bankService.showBalance(mySavingsAccount);
            System.out.println("My Savings Account Balance is: " + mySavingsAccountBalance);
        }
    }
}