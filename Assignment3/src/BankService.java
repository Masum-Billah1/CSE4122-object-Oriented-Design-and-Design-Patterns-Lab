import java.util.Hashtable;
import java.math.BigDecimal;

public class BankService {
    private Hashtable<Integer, IAccount> bankAccounts;
    private int nextAccountNumber;

    public BankService() {
        this.bankAccounts = new Hashtable<>();
        this.nextAccountNumber = 0;
    }

    public int createNewAccount(String type, BigDecimal initialAmount) {
        IAccount newAccount = null;
        nextAccountNumber += 1;

        switch (type.toLowerCase()) {
            case "savings":
                newAccount = new SavingsAccount(nextAccountNumber, initialAmount);
                break;
            case "investment":
                newAccount = new InvestmentAccount(nextAccountNumber, initialAmount);
                break;
            case "checking":
                newAccount = new CheckingAccount(nextAccountNumber, initialAmount);
                break;
            default:
                System.out.println("Invalid Account type");
                break;
        }

        if (newAccount != null) {
            bankAccounts.put(newAccount.getAccountNumber(), newAccount);
            return newAccount.getAccountNumber();
        }

        return -1;
    }

    public void transferMoney(int to, int from, BigDecimal amount) {
        IAccount toAccount = this.bankAccounts.get(to);
        IAccount fromAccount = this.bankAccounts.get(from);
        fromAccount.transfer(toAccount, amount);
    }

    public void deposit(int accountNumber, BigDecimal amount) {
        IAccount account = this.bankAccounts.get(accountNumber);
        account.deposit(amount);
    }

    public void withdraw(int accountNumber, BigDecimal amount) {
        IAccount account = this.bankAccounts.get(accountNumber);
        account.withdraw(amount);
    }

    public BigDecimal showBalance(int accountNumber) {
        IAccount account = this.bankAccounts.get(accountNumber);
        return account.showBalance();
    }
}
