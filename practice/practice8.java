package practice;
import java.util.Scanner;
public class practice8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            double subtotal = 0;
            String[] items = new String[5];
            double[] prices = new double[5];
            System.out.println("Enter name of 5 items and their prices");
            for (int i = 0; i <= 5; i++) {
                System.out.println("Item " + (i + 1) + " names");
                sc.nextLine();
                System.out.println("Items " + (i + 1) + " price");
                subtotal += sc.nextDouble();
            }
            double discount = 0;
            if (subtotal > 500) {
                discount = subtotal * 0.10;
            }
            double totalafterdiscount = subtotal - discount;
            double tax = totalafterdiscount * 0.08;
            double finaltotal = totalafterdiscount + tax;

            System.out.printf("\nSubtotal: %.2f\n", subtotal);
            System.out.printf("Discount: %.2f\n", discount);
            System.out.printf("Tax (8%%): %.2f\n", tax);
            System.out.printf("Final Total: %.2f\n", finaltotal);
            System.out.println("want another purchase press(Y/y)");
            if (!sc.next().equals("y")) {
                System.out.println("thank you for shopping!");
            break;
            }
            sc.close();
        }
    }
}
