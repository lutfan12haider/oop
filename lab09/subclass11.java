package lab09;

class BillAudit {
    public static double calculateAverageBill(ElectricityConsumer[] consumers) {
        double total = 0;
        for (ElectricityConsumer c : consumers) {
            total += c.calculateBill() + c.applyPeakHourPenalty();
        }
        return total / consumers.length;
    }
}
