package practice;
import java.util.Scanner;
import java.util.ArrayList;
public class part7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        list.add("buy groceries");
        list.add("finish homework");
        list.add("call mom");
        list.add("clean the house");
        list.add("go for a run");
        System.out.println("To-Do-List:");
        for (String s : list) {
            System.out.println("-" + s);
        }
        System.out.println("enter the item to remove");
        String itemtoremove = sc.nextLine();

        if (list.remove(itemtoremove)) {
            System.out.println("\"" + itemtoremove + "\" removed successfully.");
        } else {
            System.out.println("Item not found in the list.");
        }

        System.out.println("Updated To-Do List:");
        for (String item : list) {
            System.out.println("- " + item);
        }
    }
}
