package lab7;

class question6 {
    String brand;
    String model;

   question6(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

class Car extends question6 {
    int numberOfSeats;

    Car(String brand, String model, int numberOfSeats) {
        super(brand, model);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Number of Seats: " + numberOfSeats);
    }
}

class Bike extends question6 {
    int engineCapacity;

    Bike(String brand, String model, int engineCapacity) {
        super(brand, model);
        this.engineCapacity = engineCapacity;
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Engine Capacity: " + engineCapacity + "cc");
    }
}
