package lab09;

public class main11 {
    public static void main(String[] args) {
        ElectricityConsumer c1 = new ResidentialConsumer("R101", 80, 10);
        ElectricityConsumer c2 = new CommercialConsumer("C202", 150, 20);
        ElectricityConsumer c3 = new IndustrialConsumer("I303", 400, 50);

        c1.generateBill();
        System.out.println();

        c2.generateBill();
        System.out.println();

        c3.generateBill();
        System.out.println();

        ElectricityConsumer[] allConsumers = { c1, c2, c3 };
        double avg = BillAudit.calculateAverageBill(allConsumers);
        System.out.println("Average Bill: $" + avg);
    }
}
