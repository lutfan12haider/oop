package lab09;

interface RideService {
    double BASE_FARE = 20.0;

    double calculateFare(double distance);
    String getRideType();
    String paymentMode();
}

class EconomyRide implements RideService {
    public double calculateFare(double distance) {
        return BASE_FARE + (distance * 10);
    }

    public String getRideType() {
        return "Economy";
    }

    public String paymentMode() {
        return "Credit Card or Cash";
    }
}

class BusinessRide implements RideService {
    public double calculateFare(double distance) {
        return BASE_FARE + (distance * 15);
    }

    public String getRideType() {
        return "Business";
    }

    public String paymentMode() {
        return "Credit Card only";
    }
}

class BikeRide implements RideService {
    public double calculateFare(double distance) {
        return BASE_FARE + (distance * 5);
    }

    public String getRideType() {
        return "Bike";
    }

    public String paymentMode() {
        return "Credit Card or Cash";
    }
}


