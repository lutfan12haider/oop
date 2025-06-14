package lab5;

import java.util.ArrayList;
import java.util.List;

class Category {
    String name;
    String description;

    Category(String name, String description) {
        this.name = name;
        this.description = description;
    }
}

class Product {
    int productId;
    String productName;
    double price;
    int quantity;
    Category category;

    Product(int productId, String productName, double price, int quantity, Category category) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }
}

class Order {
    int orderId;
    String customerName;
    String customerAddress;
    List<Product> products;

    Order(int orderId, String customerName, String customerAddress) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.products = new ArrayList<>();
    }

    void addProduct(Product product) {
        products.add(product);
    }

    void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customerName);
        System.out.println("Address: " + customerAddress);
        System.out.println("Products:");
        for (Product p : products) {
            System.out.println("- " + p.productName + " (" + p.category.name + ") - $" + p.price);
        }
    }
}



