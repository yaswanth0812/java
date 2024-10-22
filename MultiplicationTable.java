import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the multiplication table: ");
        int n = scanner.nextInt();

        
        while (n <= 0) {
            System.out.print("Please enter a positive integer: ");
            n = scanner.nextInt();
        }

        System.out.println("Multiplication Table:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%4d", i * j); 
            }
            System.out.println();
        }

        scanner.close();
    }
}