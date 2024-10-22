import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have selected a number between 1 and 100, guess what it is ?");

        
        int secretNumber = random.nextInt(100) + 1;
        int userGuess;

        do {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();

            if (userGuess < secretNumber) {
                System.out.println("Too low!");
            } else if (userGuess > secretNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Congratulations! You guessed the correct number!");
            }
        } while (userGuess != secretNumber);

        scanner.close();
    }
}