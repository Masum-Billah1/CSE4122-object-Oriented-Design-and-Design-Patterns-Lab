# Banking Service with Facade Design Pattern

This project demonstrates the implementation of a Banking Service with Checking, Saving, and Investment modules using the Facade design pattern. The Facade pattern provides a simplified interface to a set of interfaces in a subsystem, making it easier to use for clients.

## Classes and Interface

### Customer

The `Customer` class is the main entry point for interacting with the banking service. It allows customers to create savings and investment accounts, transfer money between accounts, and deposit money into their accounts.

### BankService

The `BankService` class acts as a facade, providing a simplified interface to interact with various account types, including savings, investment, and checking accounts. It manages the creation of new accounts, money transfers, deposits, withdrawals, and balance inquiries.

### IAccount Interface

The `IAccount` interface defines the common methods that all account types must implement. These methods include `deposit`, `withdraw`, `transfer`, `getAccountNumber`, and `showBalance`.

### CheckingAccount

The `CheckingAccount` class implements the `IAccount` interface and represents a checking account. It allows deposits, withdrawals, transfers, and provides the current balance for the account.

### InvestmentAccount

The `InvestmentAccount` class implements the `IAccount` interface and represents an investment account. Similar to the `CheckingAccount`, it allows deposits, withdrawals, transfers, and provides the current balance.

### SavingsAccount

The `SavingsAccount` class implements the `IAccount` interface and represents a savings account. Like the other account types, it supports deposits, withdrawals, transfers, and provides the current balance.

## Usage

To use the banking service with the Facade design pattern, follow these steps:

1. Create an instance of the `BankService` class to manage the banking operations.

2. Use the `createNewAccount` method to create new savings or investment accounts with an initial deposit.

3. Use the `transferMoney` method to transfer funds between accounts.

4. Use the `deposit` method to add money to an account.

5. Use the `showBalance` method to check the current balance of an account.

6. Use the `withdraw` method (not currently implemented in the provided code) to withdraw money from an account if needed.

7. The `Customer` class demonstrates how to interact with the banking service by creating accounts, transferring money, and checking balances.

## Example

Here's an example of how to use the banking service with the Facade design pattern:

```java
BankService bankService = new BankService();

// Create a savings account with an initial deposit of $1000
int savingsAccount = bankService.createNewAccount("savings", new BigDecimal(1000));
BigDecimal savingsBalance = bankService.showBalance(savingsAccount);
System.out.println("Savings Account Balance: " + savingsBalance);

// Create an investment account with an initial deposit of $2000
int investmentAccount = bankService.createNewAccount("investment", new BigDecimal(2000));
BigDecimal investmentBalance = bankService.showBalance(investmentAccount);
System.out.println("Investment Account Balance: " + investmentBalance);

// Transfer $500 from the investment account to the savings account
bankService.transferMoney(investmentAccount, savingsAccount, new BigDecimal(500));

// Check updated balances
savingsBalance = bankService.showBalance(savingsAccount);
investmentBalance = bankService.showBalance(investmentAccount);

System.out.println("Updated Savings Account Balance: " + savingsBalance);
System.out.println("Updated Investment Account Balance: " + investmentBalance);
This example demonstrates creating accounts, transferring money, and checking balances using the provided classes and interface.
