package lab09;

interface OrderPolicy {
    void acceptOrder();
    int calculatePreparationTime();

    static void commonGuidelines() {
        System.out.println("Orders must be accepted within 2 minutes.");
        System.out.println("Preparation time should be estimated accurately.");
    }
}

interface DeliveryPolicy {
    void assignRider();
    double calculateDeliveryCharge();
}

class RestaurantPartner implements OrderPolicy, DeliveryPolicy {
    private String restaurantName;

    public RestaurantPartner(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public void acceptOrder() {
        System.out.println(restaurantName + " has accepted the order.");
    }

    public int calculatePreparationTime() {
        return 20;
    }

    public void assignRider() {
        System.out.println("Assigning regular delivery rider for " + restaurantName + ".");
    }

    public double calculateDeliveryCharge() {
        return 50.0;
    }
}

class ExpressDeliveryPartner implements DeliveryPolicy {
    private String partnerName;

    public ExpressDeliveryPartner(String partnerName) {
        this.partnerName = partnerName;
    }

    public void assignRider() {
        System.out.println("Assigning express rider from " + partnerName + ".");
    }

    public double calculateDeliveryCharge() {
        return 80.0;
    }
}
