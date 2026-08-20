import java.util.Scanner;

class Employee {
    String firstName;
    String lastName;
    double monthlySalary;

    // 1. Initialize employee details
    void initialize(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    // 2. Display employee details
    void displayDetails() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Monthly Salary: " + monthlySalary);
    }

    // 3. Modify employee salary
    void increaseSalary(double percentage) {
        monthlySalary = monthlySalary + (monthlySalary * percentage / 100);
    }

    // 4. Calculate yearly salary
    double yearlySalary() {
        return monthlySalary * 12;
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        // Employee 1
        System.out.println("Enter details of Employee 1:");

        System.out.print("First Name: ");
        String firstName1 = sc.nextLine();

        System.out.print("Last Name: ");
        String lastName1 = sc.nextLine();

        System.out.print("Monthly Salary: ");
        double salary1 = sc.nextDouble();
        sc.nextLine();

        emp1.initialize(firstName1, lastName1, salary1);

        // Employee 2
        System.out.println("\nEnter details of Employee 2:");

        System.out.print("First Name: ");
        String firstName2 = sc.nextLine();

        System.out.print("Last Name: ");
        String lastName2 = sc.nextLine();

        System.out.print("Monthly Salary: ");
        double salary2 = sc.nextDouble();

        emp2.initialize(firstName2, lastName2, salary2);

        // Display details and yearly salary before increment
        System.out.println("\n--- Employee 1 ---");
        emp1.displayDetails();
        System.out.println("Yearly Salary: " + emp1.yearlySalary());

        System.out.println("\n--- Employee 2 ---");
        emp2.displayDetails();
        System.out.println("Yearly Salary: " + emp2.yearlySalary());

        // Give 10% salary increase
        emp1.increaseSalary(10);
        emp2.increaseSalary(10);

        // Display yearly salary after increment
        System.out.println("\nAfter 10% Salary Increase:");

        System.out.println("Employee 1 Yearly Salary: " + emp1.yearlySalary());
        System.out.println("Employee 2 Yearly Salary: " + emp2.yearlySalary());
    }
}