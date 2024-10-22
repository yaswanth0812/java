import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of levels for the pyramid: ");
        int n = scanner.nextInt();
        while (n <= 0) {
            System.out.print("Please enter a positive integer: ");
            n = scanner.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
        
            System.out.println();
        }

        scanner.close();
    }
}