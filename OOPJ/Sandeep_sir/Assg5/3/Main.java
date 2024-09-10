package org.example.Assg5_3;

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Employee [] e  = new Employee [100];
		//Employee e1 = new Employee();
		int employeeCount = 0; // index
		 
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add Employee");
            System.out.println("2. Update Salary of an Employee");
            System.out.println("3. Apply Raise to All Employees");
            System.out.println("4. Display Total Employees");
            System.out.println("5. Display Total Salary Expense");
            System.out.println("6. Display All Employee Details");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee Name: ");
                    scanner.nextLine(); // consume newline
                    String name = scanner.nextLine();
                    System.out.print("Enter Employee Salary: ");
                    double salary = scanner.nextDouble();
                    e[employeeCount++] = new Employee(name, salary); //index
                    System.out.println("Employee added successfully!");
                    break;

                case 2:
                    System.out.print("Enter Employee ID to update salary: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter new salary: ");
                    double newSalary = scanner.nextDouble();
                    if (id > 0 && id <= employeeCount) {
                        e[id - 1].updateSalary(newSalary);
                        System.out.println("Salary updated successfully!");
                    } else {
                        System.out.println("Invalid Employee ID!");
                    }
                    break;

                case 3:
                    System.out.print("Enter percentage raise to apply: ");
                    double percentage = scanner.nextDouble();
                    Employee.applyRaise(e, percentage);
                    System.out.println("Salary raise applied successfully!");
                    break;

                case 4:
                    System.out.println("Total Employees: " + Employee.getTotalEmployees());
                    break;

                case 5:
                    System.out.println("Total Salary Expense: $" + Employee.calculateTotalSalaryExpense());
                    break;

                case 6:
                    for (int i = 0; i < employeeCount; i++) {
                        System.out.println(e[i]);
                    }
                    break;

                case 7:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 7);
        
        
	}

}
