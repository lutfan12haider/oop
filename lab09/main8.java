package lab09;

public class main8 {
    public static void main(String[] args) {
        RideService[] rides = new RideService[] {
                new EconomyRide(),
                new BusinessRide(),
                new BikeRide()
        };

        for (RideService ride : rides) {
            System.out.println("Ride Type: " + ride.getRideType());
            System.out.println("Fare for 10km: " + ride.calculateFare(10.0));
            System.out.println("Payment Mode: " + ride.paymentMode());
            System.out.println();
        }
    }
}