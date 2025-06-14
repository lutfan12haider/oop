package lab7;

public class question5main {
    public static void main(String[] args) {
        Product p1 = new Electronics();
        p1.showDetails();

        if (p1 instanceof Electronics) {
            Electronics e1 = (Electronics) p1;
            e1.applyWarranty();
        }

        Product p2 = new Clothing();
        p2.showDetails();

        if (p2 instanceof Clothing) {
            Clothing c1 = (Clothing) p2;
            c1.applyDiscount();
        }
    }
}