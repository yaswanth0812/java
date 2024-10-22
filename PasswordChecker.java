import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        final String CORRECT_PASSWORD = "secret123";
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter password: ");
            String enteredPassword = scanner.nextLine();

            if (enteredPassword.equals(CORRECT_PASSWORD)) {
               
                System.out.println("Password accepted.");
                break;
            } else {
                
                System.out.println("Incorrect password. Try again.");
            }
        }

        
        scanner.close();
    }
}