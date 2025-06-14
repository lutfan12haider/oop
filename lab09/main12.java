package lab09;

public class main12 {
    public static void main(String[] args) {
        TradingEngine.tradingPolicy();
        ComplianceEngine.compliancePolicy();
        System.out.println();

        AlgoTrader algo = new AlgoTrader("AlgoX");
        HumanTrader human = new HumanTrader("Bilal");

        TradingEngine[] traders = { algo, human };
        System.out.println(" Trading Actions ");
        for (TradingEngine trader : traders) {
            trader.runRiskChecks();
            trader.placeOrder();
            System.out.println();
        }

        ComplianceEngine[] complianceUnits = { algo };
        System.out.println(" Compliance Actions ");
        for (ComplianceEngine unit : complianceUnits) {
            unit.generateReport();
            unit.logAuditTrail();
            System.out.println();
        }
    }
}
