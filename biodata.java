import java.util.Scanner;

public class biodata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();  
        
        System.out.print("Enter your gender: ");
        String gender = scanner.nextLine();
       
        System.out.println("\nStudent Biodata:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        
        scanner.close();
    }
}