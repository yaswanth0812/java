import java.util.Scanner;

public class FirstDivisibleNumber {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
      
        System.out.print("Enter the upper limit: ");
        int n = scanner.nextInt();
        
        System.out.print("Enter the divisor: ");
        int d = scanner.nextInt();
        
       
        boolean found = false;
        for (int i = 1; i <= n; i++) {
            if (i % d == 0) {
                System.out.println("The first number divisible by " + d + " is " + i + ".");
                found = true;
                break; 
            }
        }
        
        if (!found) {
            System.out.println("No number between 1 and " + n + " is divisible by " + d + ".");
        }
        
        scanner.close();
    }
}