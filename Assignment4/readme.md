# A composite design pattern by using an example with a building composed of generic housing structures.

## Overview

This repository contains Java classes designed to demonstrate a composite design pattern for managing a housing structure, including buildings and rooms. The classes have been organized to create a hierarchical structure for housing units with rooms.

The main classes include:
1. `Main`: The entry point for the program that demonstrates the usage of the `Housing`, `Room`, and `IStructure` classes.

2. `Room`: represents individual rooms within a housing structure. Each room has a name and methods for entering and exiting.

3. `Housing` (formerly `Building`): represents a housing structure, which can be a building or a floor within a building. It has methods for adding structures (e.g., rooms) and managing their hierarchy.

4. `IStructure`: An interface implemented by both `Housing` and `Room`, providing common methods for entering, exiting, and getting the name of the structure.

## UML CLass diagram
![image](https://github.com/Masum-Billah1/CSE4122-object-Oriented-Design-and-Design-Patterns-Lab/assets/53857306/e178a6a4-0802-4ec6-a9f5-1275d68caabd)

## How to Use

Follow these steps to compile and run the Java program using the provided classes:

1. **Compilation**:
   - Open a command prompt or terminal.
   - Navigate to the directory containing the Java source code files using the `cd` command.

     ```shell
     cd /path/to/java/classes
     ```

   - Compile the Java program using the `javac` command:

     ```shell
     javac Main.java 
     ```

   - If successful, this will generate `.class` files for each class.

2. **Execution**:
   - Run the compiled Java program using the `java` command, specifying the `Main` class as the entry point:

     ```shell
     java Main
     ```

3. **Sample Output**:
   - The program will demonstrate the composite design pattern by creating a housing structure with rooms and simulating entering and exiting various parts of the structure.

4. **Customization**:
   - You can customize the program by modifying the `Main` class to create your own housing structures and rooms.

## Class Descriptions

### `Main` Class
- Entry point for the program.
- Demonstrates how to create a housing structure, add rooms, and simulate entering and exiting.
- Modify this class to customize the structure and behavior of the program.

### `Room` Class
- Represents individual rooms within a housing structure.
- Contains methods for entering, exiting, and obtaining the name of the room.

### `Housing` Class (formerly `Building`)
- Represents a housing structure, which can be a building or a floor within a building.
- Provides methods for adding structures (e.g., rooms) and managing their hierarchy.
- Contains methods for entering, exiting, and obtaining the name of the housing structure.

### `IStructure` Interface
- An interface implemented by both `Housing` and `Room`.
- Provides common methods for entering, exiting, and obtaining the name of the structure.


