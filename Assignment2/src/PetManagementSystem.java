import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Pet {
    private String name;
    private int age;
    private String breed;

    public Pet(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nBreed: " + breed;
    }
}

class Dog extends Pet {
    private boolean isTrained;

    public Dog(String name, int age, String breed, boolean isTrained) {
        super(name, age, breed);
        this.isTrained = isTrained;
    }

    public boolean isTrained() {
        return isTrained;
    }

    @Override
    public String toString() {
        return super.toString() + "\nIs Trained: " + isTrained;
    }
}

class Bird extends Pet {
    private boolean iscased;

    public Bird(String name, int age, String breed, boolean iscased) {
        super(name, age, breed);
        this.iscased = iscased;
    }

    public boolean isIscased;
}

class Cat extends Pet {
    private boolean isIndoor;

    public Cat(String name, int age, String breed, boolean isIndoor) {
        super(name, age, breed);
        this.isIndoor = isIndoor;
    }

    public boolean isIndoor() {
        return isIndoor;
    }

    @Override
    public String toString() {
        return super.toString() + "\nIs Indoor: " + isIndoor;
    }
}

public class PetManagementSystem {
    public static void main(String[] args) {
        List<Pet> pets = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Pet Management System Menu:");
            System.out.println("1. Add a Dog");
            System.out.println("2. Add a Cat");
            System.out.println("3. Add a Bird");
            System.out.println("4. List all Pets");
            System.out.println("5. Delete a pet");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Dog's Name: ");
                    String dogName = scanner.nextLine();
                    System.out.print("Enter Dog's Age: ");
                    int dogAge = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Dog's Breed: ");
                    String dogBreed = scanner.nextLine();
                    System.out.print("Is Dog Trained? (true/false): ");
                    boolean isDogTrained = scanner.nextBoolean();
                    scanner.nextLine(); // Consume newline
                    pets.add(new Dog(dogName, dogAge, dogBreed, isDogTrained));
                    System.out.println("Dog added successfully!");
                    break;

                case 2:
                    System.out.print("Enter Cat's Name: ");
                    String catName = scanner.nextLine();
                    System.out.print("Enter Cat's Age: ");
                    int catAge = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Cat's Breed: ");
                    String catBreed = scanner.nextLine();
                    System.out.print("Is Cat Indoor? (true/false): ");
                    boolean isCatIndoor = scanner.nextBoolean();
                    scanner.nextLine(); // Consume newline
                    pets.add(new Cat(catName, catAge, catBreed, isCatIndoor));
                    System.out.println("Cat added successfully!");
                    break;

                case 3:
                    System.out.print("Enter Bird's Name: ");
                    String birdName = scanner.nextLine();
                    System.out.print("Enter Bird's Age: ");
                    int birdAge = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Bird's Breed: ");
                    String birdBreed = scanner.nextLine();
                    System.out.print("Is bird caged? (true/false): ");
                    boolean isBirdCaged = scanner.nextBoolean();
                    scanner.nextLine();
                    pets.add(new Cat(birdName, birdAge, birdBreed, isBirdCaged));
                    System.out.println("Bird added successfully!");
                    break;

                case 4:
                    int size = pets.size();
                    System.out.println("Number of pets: "+size);
                    if(size == 0){
                        System.out.println("No pet exists.\n");
                    }
                    else {
                        System.out.println("List of Pets:");
                        for (Pet pet : pets) {
                            System.out.println(pet + "\n");
                        }
                    }
                    break;

                case 5:
                    System.out.print("Pet number to delete: ");
                    int number = scanner.nextInt();
                    scanner.nextLine();
                    pets.remove(number-1);
                    System.out.println("Pet is deleted successfully");
                    break;

                case 6:
                    System.out.println("Exiting Pet Management System. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
