import java.util.Scanner;
 
class Employee {
    String firstName;
    String lastName;
    double salary;
 
    Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
}
 
public class Assignment6_6 {
 
    public static Employee[] readEmployees(int n) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[n];
 
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
            System.out.print("First Name: ");
            String firstName = scanner.nextLine();
 
            System.out.print("Last Name: ");
            String lastName = scanner.nextLine();
 
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();
 
            employees[i] = new Employee(firstName, lastName, salary);
        }
 
        return employees;
    }
 
    public static void displayEmployees(Employee[] employees) {
        System.out.println("\nEmployee Details:");
        for (Employee emp : employees) {
            System.out.println("Name: " + emp.firstName + " " + emp.lastName +
                               ", Salary: " + emp.salary);
        }
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("How many employees? ");
        int n = scanner.nextInt();
        scanner.nextLine();
 
        Employee[] employees = readEmployees(n);
        displayEmployees(employees);
    }
}