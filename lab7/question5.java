package lab7;

class Product {
    void showDetails() {
        System.out.println("This is a product.");
    }
}

class Electronics extends Product {
    @Override
    void showDetails() {
        System.out.println("This is an electronic product.");
    }

    void applyWarranty() {
        System.out.println("Warranty applied to electronic product.");
    }
}

class Clothing extends Product {
    @Override
    void showDetails() {
        System.out.println("This is a clothing product.");
    }

    void applyDiscount() {
        System.out.println("Discount applied to clothing product.");
    }
}


