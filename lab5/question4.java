package lab5;
import java.util.*;

class Car {
    String registrationNumber;
    String modelName;
    double rentalPrice;
    CarCategory category;

    Car(String registrationNumber, String modelName, double rentalPrice, CarCategory category) {
        this.registrationNumber = registrationNumber;
        this.modelName = modelName;
        this.rentalPrice = rentalPrice;
        this.category = category;
        category.addCar(this);
    }
}

class CarCategory {
    String categoryName;
    List<Car> cars;

    CarCategory(String categoryName) {
        this.categoryName = categoryName;
        this.cars = new ArrayList<>();
    }

    void addCar(Car car) {
        cars.add(car);
    }
}

class Customer {
    String name;
    String drivingLicenseNumber;
    String contactDetails;

    Customer(String name, String drivingLicenseNumber, String contactDetails) {
        this.name = name;
        this.drivingLicenseNumber = drivingLicenseNumber;
        this.contactDetails = contactDetails;
    }
}

class Rental {
    Customer customer;
    Car car;
    int rentalDuration;

    Rental(Customer customer, Car car, int rentalDuration) {
        this.customer = customer;
        this.car = car;
        this.rentalDuration = rentalDuration;
    }

    void showRentalDetails() {
        System.out.println("Customer: " + customer.name);
        System.out.println("Car: " + car.modelName + " (" + car.registrationNumber + ")");
        System.out.println("Category: " + car.category.categoryName);
        System.out.println("Rental Duration: " + rentalDuration + " days");
    }
}


