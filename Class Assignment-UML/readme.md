# UML Sequence Diagram for ATM Machine

## Introduction

This repository contains a UML Sequence Diagram representing the steps involved in a typical ATM machine transaction, including both card-based and cardless transactions. The UML Sequence Diagram provides a visual representation of the interactions between various components in the system during the process.

## UML Sequence Diagram

![atm_sequence_diagram](https://github.com/Masum-Billah1/CSE4122-object-Oriented-Design-and-Design-Patterns-Lab/assets/53857306/6b7a972d-42f8-47a8-87d4-a6ba11a2fd99)


## Transaction Steps

### Card-based Transaction

1. **User inserts ATM card into the machine.**
2. **ATM validates the card with the bank.**
3. **User enters their Personal Identification Number (PIN).**
4. **ATM validates the PIN with the bank.**
5. **User selects the type of transaction (e.g., withdraw cash, deposit cash, check balance, etc.).**
6. **ATM follows the instructions for the selected transaction type.**
7. **ATM dispenses cash or completes the other transaction as requested.**

### Cardless Transaction

1. **User selects the "Cardless transaction" option on the ATM screen.**
2. **User enters their account number.**
3. **ATM validates the account number with the bank.**
4. **ATM generates a One-Time Password (OTP) and sends it to the user's registered mobile phone number.**
5. **User enters the OTP on the ATM screen.**
6. **ATM validates the OTP with the bank.**
7. **User selects the type of transaction (e.g., withdraw cash, deposit cash, check balance, etc.).**
8. **ATM follows the instructions for the selected transaction type.**
9. **ATM dispenses cash or completes the other transaction as requested.**

## How to Use the Diagram

This UML Sequence Diagram is provided to help users understand the sequence of steps involved in an ATM transaction and to identify potential areas for improvement in the process. The diagram visually represents the flow of interactions between the user, the ATM machine, and the bank during both card-based and cardless transactions.

For instance, the diagram highlights that the ATM performs duplicate card and PIN validation steps with the bank, once when validating the card and again when validating the PIN. This may suggest an opportunity for optimization to streamline the process and reduce the time required to complete a transaction.

Feel free to analyze and utilize this UML Sequence Diagram for educational or reference purposes. It can be helpful in system design, analysis, and improvement efforts related to ATM machine transactions.

Please reach out if you have any questions or need further clarification regarding the diagram or the ATM transaction process.
