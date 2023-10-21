# Online Retail Store Order Fulfillment System

## Introduction

This Java program demonstrates an online retail store order fulfillment system that implements the Proxy design pattern with user authentication.

## Proxy Design Pattern

The Proxy design pattern is a structural pattern that controls access to objects and adds security measures. In this program, we use the Proxy pattern to:

- Control access to the real subject, which is the `Warehouse` responsible for order fulfillment.
- Add a layer of user authentication before allowing order fulfillment to occur.

## Classes and Interfaces

- `IOrder` Interface: Defines the common interface for both the proxy and the real subject.

- `UserAuthentication` Class: Simulates user authentication by checking entered username and password.

- `Warehouse` Class: Represents the real subject, containing stock information and fulfilling orders.

- `OrderFulfillmentProxy` Class: Serves as the proxy, providing access control through user authentication.

- `Item` Class: Represents an item in an order.

- `Order` Class: Represents an order containing a list of items.

## Usage

1. Clone this repository to your local machine.

2. Compile the Java source files:

   ```bash
   javac Main.java

3. Run the program:
   
   `java Main`
   
*Follow the prompts to simulate user authentication and place an order.

