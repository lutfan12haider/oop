package lab09;
abstract class UberRide {
    protected String rideId;
    protected double distance;
    protected double baseFare;

    public UberRide(String rideId, double distance, double baseFare) {
        this.rideId = rideId;
        this.distance = distance;
        this.baseFare = baseFare;
    }

    public abstract double calculateFare();
    public abstract void dispatchDriver();

    public void printReceipt() {
        System.out.println("Ride ID: " + rideId);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Base Fare: $" + baseFare);
    }
}

class UberX extends UberRide {
    private double surgeFactor = 1.2;

    public UberX(String rideId, double distance, double baseFare) {
        super(rideId, distance, baseFare);
    }

    public double calculateFare() {
        return baseFare + (distance * 1.5 * surgeFactor);
    }

    public void dispatchDriver() {
        System.out.println("Dispatching nearest UberX driver");
    }
}

class UberBlack extends UberRide {
    private double luxurySurcharge = 15.0;

    public UberBlack(String rideId, double distance, double baseFare) {
        super(rideId, distance, baseFare);
    }

    public double calculateFare() {
        return baseFare + (distance * 3.0) + luxurySurcharge;
    }

    public void dispatchDriver() {
        System.out.println("Dispatching a premium UberBlack driver");
    }
}

class UberXL extends UberRide {
    private double surgeFactor = 1.5;

    public UberXL(String rideId, double distance, double baseFare) {
        super(rideId, distance, baseFare);
    }

    public double calculateFare() {
        return baseFare + (distance * 2.0 * surgeFactor);
    }

    public void dispatchDriver() {
        System.out.println("Dispatching a spacious UberXL driver");
    }
}

class RideAnalytics {
    public static void analyzeRide(UberRide ride) {
        System.out.println("\n--- Ride Analytics ---");
        ride.printReceipt();
        System.out.println("Calculated Fare: $" + ride.calculateFare());
        System.out.println("Ride Category: " + ride.getClass().getSimpleName());
    }
}



