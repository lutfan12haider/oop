package labtask4;

import java.util.Scanner;

public class main12 {
    public static void main(String[] args) {
        lab12 book1 = new lab12("Java Programming", "James Gosling", 500);
        lab12 book2 = new lab12("Python Basics", "Guido van Rossum");
        lab12 book3 = new lab12("Mystery Novel", "Unknown");

        System.out.println("Book 1 Details:");
        book1.displayBookDetails();

        System.out.println("\nBook 2 Details:");
        book2.displayBookDetails();

        System.out.println("\nBook 3 Details:");
        book3.displayBookDetails();
    }
}
