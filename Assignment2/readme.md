# Pet Management System

The Pet Management System is a Java program that allows users to manage a list of pets. It includes three types of pets: Dogs, Cats, and Birds. This system demonstrates object-oriented programming principles such as abstraction, encapsulation, and polymorphism.

## Features

- **Add a Pet**: Users can add a Dog, Cat, or Bird to the system. They need to provide the pet's name, age, breed, and specific characteristics like training status for dogs, indoor status for cats, and cage status for birds.

- **List All Pets**: Users can view a list of all the pets currently in the system, including their details.

- **Delete a Pet**: Users can delete a pet by specifying its position in the list.

- **Exit**: Users can exit the program.

## Usage

1. Run the `PetManagementSystem` Java program.

2. You will be presented with a menu with the following options:

   - `1. Add a Dog`: Enter details for a new dog.
   - `2. Add a Cat`: Enter details for a new cat.
   - `3. Add a Bird`: Enter details for a new bird.
   - `4. List all Pets`: View the list of all pets.
   - `5. Delete a pet`: Delete a pet by specifying its position.
   - `6. Exit`: Exit the program.

3. Follow the on-screen instructions to interact with the system.

## Object-Oriented Principles

- **Abstraction**: The `Pet` class is an abstract class that defines common attributes and behaviors of all pets, while specific pet types (Dog, Cat, Bird) inherit from it and provide their unique features.

- **Encapsulation**: Private fields in the `Pet` class are accessed through getter methods, encapsulating the data and providing controlled access.

- **Polymorphism**: The `Pet` objects are stored in a list, and polymorphism allows you to work with them in a unified way, regardless of their specific type.

## Example Usage

Here's an example of how to use the Pet Management System:

1. Add a Dog:
   - Enter the dog's name: Rex
   - Enter the dog's age: 3
   - Enter the dog's breed: Labrador
   - Is Dog Trained? (true/false): true

2. List all Pets:
   - You'll see a list with Rex, the dog you just added.

3. Add a Cat:
   - Enter the cat's name: Whiskers
   - Enter the cat's age: 2
   - Enter the cat's breed: Siamese
   - Is Cat Indoor? (true/false): true

4. List all Pets:
   - You'll see a list with both Rex and Whiskers.

5. Delete a Pet:
   - Enter the pet number to delete (e.g., 1 to delete Rex).

6. List all Pets:
   - You'll see a list with only Whiskers.

7. Exit the program.

## Note

- Please make sure you have Java installed on your system to run this program.
- The program uses a simple command-line interface (CLI) for user interaction.
