package labtask4;

public class lab12 {
    private String title;
    private String author;
    private double price;

    public lab12() {
        this.title = "Unknown Title";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public lab12(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;
    }

    public lab12(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
