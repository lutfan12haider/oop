package labtask03;
public class Question7 {
    private String title;
    private String author;
    private double price;

    public Question7(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public String bookDetails() {
        return "Book Title: " + title + "\nAuthor: " + author + "\nPrice: $" + price;
    }
}


