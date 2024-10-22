import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int n = scanner.nextInt();

        while (n <= 0) {
            System.out.print("Please enter a positive integer: ");
            n = scanner.nextInt();
        }


        int[] currentRow = new int[n + 1];

        System.out.println("Pascal's Triangle:");
        for (int i = 0; i < n; i++) {
            
            for (int k = 0; k < n - i; k++) {
                System.out.print(" ");
            }

            
            for (int j = 0; j <= i; j++) {
                
                if (j == 0 || j == i) {
                    currentRow[j] = 1;
                } else {
                    
                    currentRow[j] = currentRow[j] + currentRow[j - 1];
                }
                System.out.print(currentRow[j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}