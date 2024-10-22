import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        double weight = Scanner.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = Scanner.nextDouble();

        double bmi = weight / (height * height);

        String category;
        if (bmi < 18.5) 
        {
            category = "Underweight";
        } 
        else if (bmi < 24.9)
        {
            category = "Normal weight";
        } else if (bmi < 29.9) 
        {
            category = "Overweight";
        } 
        else 
        {
            category = "Obesity";
        }

        System.out.printf("BMI: %.2f, Category: %s%n", bmi, category);

        Scanner.close();
    }
    
}
