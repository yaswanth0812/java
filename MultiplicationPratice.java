import java.util.Random;
import java.util.Scanner;

 class MultiplicationPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Multiplication Practice Program!");

        while (true) {
            int num1 = random.nextInt(10) + 1; 
            int num2 = random.nextInt(10) + 1; 

            System.out.printf("What is %d * %d?%n", num1, num2);
            System.out.print("Enter your answer (or 0 to exit): ");
            int answer = scanner.nextInt();

            if (answer == 0) {
                break;
            }

            int correctAnswer = num1 * num2;
            if (answer == correctAnswer) {
                System.out.println("Correct!");
            } else {
                System.out.printf("Incorrect. The correct answer is %d.%n", correctAnswer);
            }
        }

        System.out.println("Thank you for practicing multiplication!");
        scanner.close();
    }
}