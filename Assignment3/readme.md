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

Imagine you're a bank customer with Savings and Investment accounts:

1. **Account Creation**:
   - Savings Account: Initial deposit of $1,000.
   - Investment Account: Initial deposit of $2,000.

2. **Monitoring Balances**:
   - Savings: $1,000.
   - Investment: $2,000.

3. **Transferring Funds**:
   - Transfer $500 from Investment to Savings.

4. **Updated Balances**:
   - Savings: $1,500.
   - Investment: $1,500.

This real-life scenario showcases how the banking service with the Facade design pattern simplifies managing accounts, transfers, and balance tracking.
