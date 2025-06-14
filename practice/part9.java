package practice;
import java.util.Scanner;
public class part9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumEven=0; int sumOdd=0;
        System.out.println("Enter numbers between 1 and 100 (enter -1 to stop):");

        while (true) {
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            if (num < 1 || num > 100) {
                System.out.println("Please enter a number between 1 and 100.");
                continue;
            }
            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
        }

        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);

        scanner.close();
    }
    }

