package lab5;

public class Main1 {
    public static void main(String[] args) {
        Category electronics = new Category("Electronics", "Electronic items");
        Category clothing = new Category("Clothing", "Apparel and accessories");

        Product laptop = new Product(1, "Laptop", 1200.00, 1, electronics);
        Product tshirt = new Product(2, "T-Shirt", 20.00, 2, clothing);

        Order order1 = new Order(101, "lutfan", "123 Main St");
        order1.addProduct(laptop);
        order1.addProduct(tshirt);

        order1.showOrderDetails();
    }
}
