import java.util.Scanner;

class Employee {
    String name;
    int id;
    double basicSalary;
    double allowances;



    Employee(String name, int id, double basicSalary, double allowances) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
        this.allowances = allowances;
    }


    double GrossSalary() {
        return basicSalary + allowances;
    }


    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Basic Salary: $" + basicSalary);
        System.out.println("Allowances: $" + allowances);
        System.out.println("Gross Salary: $" + GrossSalary());
    }
}

public class EmployeeManager {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of employees: ");
        int numberOfEmployees = scanner.nextInt();


        Employee[] employees = new Employee[numberOfEmployees];


        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");

            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();

            System.out.print("ID: ");
            int id = scanner.nextInt();

            System.out.print("Basic Salary: ");
            double basicSalary = scanner.nextDouble();

            System.out.print("Allowances: ");
            double allowances = scanner.nextDouble();


            employees[i] = new Employee(name, id, basicSalary, allowances);
        }


        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("\nDetails of employee " + (i + 1) + ":");
            employees[i].display();
        }


    }
}
