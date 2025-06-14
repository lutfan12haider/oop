package practice;
import java.util.Scanner;

public class part11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctname = "user123";
        String correctpassword = "user123";

        System.out.println("Enter username:");
        String username = sc.nextLine();
        System.out.println("Enter password:");
        String password = sc.nextLine();

        double balance = 1000.00;  // Move balance outside to access it in the loop

        if (username.equals(correctname) && password.equals(correctpassword)) {
            System.out.println("Login successfully!");

            while (true) {
                System.out.println("\nMenu:");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Quit");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.printf("Your balance is: %.2f\n", balance);
                        break;
                    case 2:
                        System.out.print("Enter deposit amount: ");
                        double deposit = sc.nextDouble();
                        balance += deposit;
                        System.out.println("Deposit successful!");
                        break;
                    case 3:
                        System.out.print("Enter withdrawal amount: ");
                        double withdraw = sc.nextDouble();
                        if (withdraw <= balance) {
                            balance -= withdraw;
                            System.out.println("Withdrawal successful!");
                        } else {
                            System.out.println("Insufficient balance!");
                        }
                        break;
                    case 4:
                        System.out.println("Thank you for using the bank system. Goodbye!");
                        sc.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } else {
            System.out.println("Invalid username or password. Access denied.");
        }

        sc.close();  // Close scanner only once at the end
    }
}
