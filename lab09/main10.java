package lab09;

public class main10 {
    public static void main(String[] args) {
        OrderPolicy.commonGuidelines();

        RestaurantPartner partner = new RestaurantPartner("Pizza Point");

        OrderPolicy orderRef = partner;
        orderRef.acceptOrder();
        System.out.println("Preparation Time: " + orderRef.calculatePreparationTime() + " minutes");

        DeliveryPolicy deliveryRef = partner;
        deliveryRef.assignRider();
        System.out.println("Delivery Charge: " + deliveryRef.calculateDeliveryCharge());

        DeliveryPolicy[] deliveryPartners = new DeliveryPolicy[2];
        deliveryPartners[0] = new RestaurantPartner("Burger World");
        deliveryPartners[1] = new ExpressDeliveryPartner("FastX");

        System.out.println("\n--- Delivery Partners ---");
        for (DeliveryPolicy dp : deliveryPartners) {
            dp.assignRider();
            System.out.println("Charge: " + dp.calculateDeliveryCharge());
        }
    }
}
