import java.math.BigDecimal;

public class CheckingAccount implements IAccount {
    private final int accountNumber;
    private BigDecimal balance;

    public CheckingAccount(int accountNumber, BigDecimal initialAmount) {
        this.accountNumber = accountNumber;
        this.balance = initialAmount;
    }

    @Override
    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }

    @Override
    public void transfer(IAccount toAccount, BigDecimal amount) {
        toAccount.deposit(amount);
        balance = balance.subtract(amount);
    }

    @Override
    public void withdraw(BigDecimal amount) {
        balance = balance.subtract(amount);
    }

    @Override
    public int getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal showBalance() {
        return balance;
    }
}
