package labtask03;

public class Question5 {
    public String itemName;
    public int itemID;
    private double price;
    private int stock;

    public Question5(String itemName, int itemID, double price, int stock) {
        this.itemName = itemName;
        this.itemID = itemID;
        setPrice(price);
        setStock(stock);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            throw new IllegalArgumentException("Stock cannot be negative.");
        }
    }

    public void displayItem() {
        System.out.println("Item ID: " + itemID);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: $" + price);
        System.out.println("Stock: " + stock);
    }

    public boolean searchItem(String name) {
        return this.itemName.equalsIgnoreCase(name);
    }

    public boolean searchItem(int id) {
        return this.itemID == id;
    }

    public void purchaseItem(int quantity) {
        if (quantity > stock) {
            System.out.println("Error: Insufficient stock. Only " + stock + " items available.");
        } else {
            stock -= quantity;
            double totalBill = quantity * price;
            System.out.println("Purchase successful! Total Bill: $" + totalBill);
        }
    }
}
