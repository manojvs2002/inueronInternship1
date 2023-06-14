package inueronproject1;

import java.util.Scanner;

public class SimpleBankingApplication {
    private static double balance = 0;  // Initial balance is 0

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Simple Banking Application!");

        int choice;
        do {
            System.out.println();
            System.out.println("Please select an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the Simple Banking Application!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }

    private static void checkBalance() {
        System.out.println("Your balance is: $" + balance);
    }

    private static void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("$" + amount + " has been deposited successfully.");
        } else {
            System.out.println("Invalid amount. Please try again.");
        }
    }

    private static void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("$" + amount + " has been withdrawn successfully.");
            } else {
                System.out.println("Insufficient balance. Please try again.");
            }
        } else {
            System.out.println("Invalid amount. Please try again.");
        }
    }
}

