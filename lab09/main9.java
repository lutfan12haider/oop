package lab09;


public class main9 {
    public static void main(String[] args) {
        UberRide ride1 = new UberX("CLO123", 10.0, 5.0);
        UberRide ride2 = new UberBlack("IK804", 8.0, 10.0);
        UberRide ride3 = new UberXL("LO2024", 12.0, 7.0);

        ride1.dispatchDriver();
        RideAnalytics.analyzeRide(ride1);

        ride2.dispatchDriver();
        RideAnalytics.analyzeRide(ride2);

        ride3.dispatchDriver();
        RideAnalytics.analyzeRide(ride3);
    }
}