package ATB15xTests_11th_Jan;

import java.util.Scanner;
//Write a Java program to perform addition, subtraction, multiplication, or division based on user choice using a switch statement.
public class UsersChoiceArithOperations
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking two numbers from user
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Display choices
        System.out.println("\nChoose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        // Switch case for operations
        switch (choice) {
            case 1:
                System.out.println("Result = " + (num1 + num2));
                break;

            case 2:
                System.out.println("Result = " + (num1 - num2));
                break;

            case 3:
                System.out.println("Result = " + (num1 * num2));
                break;

            case 4:
                if (num2 != 0) {
                    System.out.println("Result = " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
