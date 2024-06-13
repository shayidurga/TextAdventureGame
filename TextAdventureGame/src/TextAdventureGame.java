import java.util.Scanner;

public class TextAdventureGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepPlaying = true;

        while (keepPlaying) {
            System.out.println("Welcome to the Adventure Game!");
            System.out.println("You find yourself at a crossroads. Do you go left or right?");
            System.out.print("Enter 'left' or 'right': ");
            String choice1 = scanner.nextLine().trim().toLowerCase();

            if (choice1.equals("left")) {
                leftPath(scanner);
            } else if (choice1.equals("right")) {
                rightPath(scanner);
            } else {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.nextLine().trim().toLowerCase();
            if (!playAgain.equals("yes")) {
                keepPlaying = false;
                System.out.println("Thanks for playing!");
            }
        }
        scanner.close();
    }

    private static void leftPath(Scanner scanner) {
        System.out.println("You took the left path and encounter a friendly dragon.");
        System.out.println("Do you talk to the dragon, run away, or offer it food?");
        System.out.print("Enter 'talk', 'run', or 'food': ");
        String choice2 = scanner.nextLine().trim().toLowerCase();

        if (choice2.equals("talk")) {
            System.out.println("The dragon shares a treasure with you. You win!");
        } else if (choice2.equals("run")) {
            System.out.println("You run away safely, but miss out on an adventure.");
        } else if (choice2.equals("food")) {
            System.out.println("The dragon is pleased with your offer and grants you a wish.");
            dragonWish(scanner);
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void dragonWish(Scanner scanner) {
        System.out.println("The dragon offers you a wish. Do you wish for wealth, power, or knowledge?");
        System.out.print("Enter 'wealth', 'power', or 'knowledge': ");
        String choice3 = scanner.nextLine().trim().toLowerCase();

        if (choice3.equals("wealth")) {
            System.out.println("You become the richest person in the land. You win!");
        } else if (choice3.equals("power")) {
            System.out.println("You become a powerful ruler. You win!");
        } else if (choice3.equals("knowledge")) {
            System.out.println("You become the wisest person in the world. You win!");
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void rightPath(Scanner scanner) {
        System.out.println("You took the right path and find a mysterious cave.");
        System.out.println("Do you enter the cave, walk past it, or inspect the surroundings?");
        System.out.print("Enter 'enter', 'walk', or 'inspect': ");
        String choice2 = scanner.nextLine().trim().toLowerCase();

        if (choice2.equals("enter")) {
            System.out.println("Inside the cave, you discover a hidden village. You win!");
        } else if (choice2.equals("walk")) {
            System.out.println("You walk past the cave and get lost in the forest.");
            forestAdventure(scanner);
        } else if (choice2.equals("inspect")) {
            System.out.println("You find hidden markings that lead to a secret passage.");
            secretPassage(scanner);
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void forestAdventure(Scanner scanner) {
        System.out.println("In the forest, you find a magical tree. Do you climb it, rest under it, or ignore it?");
        System.out.print("Enter 'climb', 'rest', or 'ignore': ");
        String choice3 = scanner.nextLine().trim().toLowerCase();

        if (choice3.equals("climb")) {
            System.out.println("You climb the tree and find a hidden treehouse with treasures. You win!");
        } else if (choice3.equals("rest")) {
            System.out.println("You rest and have a peaceful dream. You gain magical powers. You win!");
        } else if (choice3.equals("ignore")) {
            System.out.println("You ignore the tree and continue wandering until you find your way home.");
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void secretPassage(Scanner scanner) {
        System.out.println("You enter the secret passage and find an underground library. Do you explore it, take a book, or leave?");
        System.out.print("Enter 'explore', 'book', or 'leave': ");
        String choice3 = scanner.nextLine().trim().toLowerCase();

        if (choice3.equals("explore")) {
            System.out.println("You explore the library and find ancient knowledge. You become a sage. You win!");
        } else if (choice3.equals("book")) {
            System.out.println("You take a magical book that grants you wishes. You win!");
        } else if (choice3.equals("leave")) {
            System.out.println("You leave the passage and find your way back to the surface.");
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
    }
}
