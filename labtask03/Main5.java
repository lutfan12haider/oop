package labtask03;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Question5 item1 = new Question5("Laptop", 101, 750.50, 10);
        Question5 item2 = new Question5("Mouse", 102, 25.99, 50);
        Question5 item3 = new Question5("Keyboard", 103, 45.75, 30);

        Question5[] inventory = {item1, item2, item3};

        System.out.print("Enter item name or ID to search: ");
        if (scanner.hasNextInt()) {
            int searchID = scanner.nextInt();
            for (Question5 item : inventory) {
                if (item.searchItem(searchID)) {
                    System.out.println("Item found:");
                    item.displayItem();
                    processPurchase(scanner, item);
                    break;
                }
            }
        } else {
            String searchName = scanner.next();
            for (Question5 item : inventory) {
                if (item.searchItem(searchName)) {
                    System.out.println("Item found:");
                    item.displayItem();
                    processPurchase(scanner, item);
                    break;
                }
            }
        }
        scanner.close();
    }

    private static void processPurchase(Scanner scanner, Question5 item) {
        System.out.print("Enter quantity to purchase: ");
        int quantity = scanner.nextInt();
        item.purchaseItem(quantity);
        System.out.println("Updated stock: " + item.getStock());
    }
}

