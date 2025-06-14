package lab7;

public class Main6 {
    public static void main(String[] args) {

        Car myCar = new Car("Toyota", "Lexus", 5);
        System.out.println("Car Details:");
        myCar.showDetails();

        Bike myBike = new Bike("Yamaha", "R15", 155);
        System.out.println("\nBike Details:");
        myBike.showDetails();
    }
}
