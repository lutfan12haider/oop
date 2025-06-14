package lab09;

abstract class ElectricityConsumer {
    protected String consumerId;
    protected double unitsConsumed;
    protected double peakHourUsage;

    public ElectricityConsumer(String consumerId, double unitsConsumed, double peakHourUsage) {
        this.consumerId = consumerId;
        this.unitsConsumed = unitsConsumed;
        this.peakHourUsage = peakHourUsage;
    }

    public abstract double calculateBill();
    public abstract double applyPeakHourPenalty();

    public void generateBill() {
        double baseBill = calculateBill();
        double penalty = applyPeakHourPenalty();
        double total = baseBill + penalty;
        System.out.println("Consumer ID: " + consumerId);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Peak Hour Usage: " + peakHourUsage);
        System.out.println("Base Bill: $" + baseBill);
        System.out.println("Peak Hour Penalty: $" + penalty);
        System.out.println("Total Bill: $" + total);
    }
}

class ResidentialConsumer extends ElectricityConsumer {
    public ResidentialConsumer(String consumerId, double unitsConsumed, double peakHourUsage) {
        super(consumerId, unitsConsumed, peakHourUsage);
    }

    public double calculateBill() {
        double rate = 0.5;
        double bill = unitsConsumed * rate;
        return bill < 50 ? 50 : bill;
    }

    public double applyPeakHourPenalty() {
        return peakHourUsage * 0.2;
    }
}

class CommercialConsumer extends ElectricityConsumer {
    public CommercialConsumer(String consumerId, double unitsConsumed, double peakHourUsage) {
        super(consumerId, unitsConsumed, peakHourUsage);
    }

    public double calculateBill() {
        double rate = 0.75;
        double bill = unitsConsumed * rate;
        return bill < 100 ? 100 : bill;
    }

    public double applyPeakHourPenalty() {
        return peakHourUsage * 0.5;
    }
}

class IndustrialConsumer extends ElectricityConsumer {
    public IndustrialConsumer(String consumerId, double unitsConsumed, double peakHourUsage) {
        super(consumerId, unitsConsumed, peakHourUsage);
    }

    public double calculateBill() {
        double rate = 1.0;
        double bill = unitsConsumed * rate;
        return bill < 500 ? 500 : bill;
    }

    public double applyPeakHourPenalty() {
        return peakHourUsage * 1.0;
    }
}
