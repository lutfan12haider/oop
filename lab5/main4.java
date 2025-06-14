package lab5;

public class main4 {
    public static void main(String[] args) {
        CarCategory sedan = new CarCategory("Sedan");
        CarCategory suv = new CarCategory("SUV");

        Car car1 = new Car("ABC123", "Toyota Camry", 50.0, sedan);
        Car car2 = new Car("XYZ789", "Honda CR-V", 70.0, suv);

        Customer customer1 = new Customer("lutfan", "DL12345", "123-456-7890");

        Rental rental1 = new Rental(customer1, car1, 5);

        rental1.showRentalDetails();
    }
}