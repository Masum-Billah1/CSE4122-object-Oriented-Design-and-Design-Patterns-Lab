import java.math.BigDecimal;

public class InvestmentAccount implements IAccount {
    private final int accountNumber;
    private BigDecimal balance;

    public InvestmentAccount(int accountNumber, BigDecimal initialAmount) {
        this.accountNumber = accountNumber;
        this.balance = initialAmount;
    }

    @Override
    public void deposit(BigDecimal amount) {
        this.balance = this.balance.add(amount);
    }

    @Override
    public void transfer(IAccount toAccount, BigDecimal amount) {
        toAccount.deposit(amount);
        this.balance = this.balance.subtract(amount);
    }

    @Override
    public void withdraw(BigDecimal amount) {
        this.balance = this.balance.subtract(amount);
    }

    @Override
    public int getAccountNumber() {
        return this.accountNumber;
    }

    public BigDecimal showBalance() {
        return this.balance;
    }
}