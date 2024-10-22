import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year needed: ");
        int year = scanner.nextInt();

        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                System.out.println(year+" . The following year is a leap year.");
            } else {
                System.out.println(year+" is Not a leap year because it's divisible by 100 but not by 400.");
            }
        } else {
            System.out.println( year+" is Not a leap year because it's not divisible by 4.");
        }

        scanner.close();
    }
}
