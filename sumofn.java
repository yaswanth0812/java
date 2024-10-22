import java.util.Scanner;

public class sumofn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a positive integer :");
        int n = scanner.nextInt();

        while(n <= 0){
            System.out.println("please enter a positive integer: ");
            n = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.printf("Sum of first %d natural numbers: %d%n", n, sum);

        scanner.close();


    }  
    
}
