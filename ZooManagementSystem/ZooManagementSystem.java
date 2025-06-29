import java.util.ArrayList;
import java.util.Scanner;

// Base class
class Animal {
    String name;
    String type;
    int age;
    String birthplace;

    public Animal(String name, String type, int age, String birthplace) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.birthplace = birthplace;
    }

    public void displayInfo() {
        System.out.println("Name       : " + name);
        System.out.println("Type       : " + type);
        System.out.println("Age        : " + age + " years");
        System.out.println("Birthplace : " + birthplace + "\n");
    }
}

// Main Zoo Management Class
public class ZooManagementSystem {
    static ArrayList<Animal> zoo = new ArrayList<>();

    public static void addAnimal(Scanner scanner) {
        System.out.print("Enter animal name: ");
        String name = scanner.next();
        System.out.print("Enter animal type (e.g. Lion, Elephant): ");
        String type = scanner.next();
        System.out.print("Enter animal age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter animal birthplace: ");
        String birthplace = scanner.nextLine();

        Animal animal = new Animal(name, type, age, birthplace);
        zoo.add(animal);
        System.out.println("Animal added successfully!\n");
    }

    public static void displayAllAnimals() {
        if (zoo.isEmpty()) {
            System.out.println("No animals in the zoo.\n");
        } else {
            System.out.println("List of Animals in the Zoo:\n");
            for (Animal animal : zoo) {
                animal.displayInfo();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== Zoo Management System =====");
            System.out.println("1. Add Animal");
            System.out.println("2. Display All Animals");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    addAnimal(scanner);
                    break;
                case 2:
                    displayAllAnimals();
                    break;
                case 3:
                    System.out.println("Exiting Zoo Management System.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.\n");
            }
        } while (choice != 3);

        scanner.close();
    }
}
