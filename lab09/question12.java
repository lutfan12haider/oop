package lab09;

interface TradingEngine {
    void placeOrder();
    void runRiskChecks();

    static void tradingPolicy() {
        System.out.println("Trading Policy: Orders must pass risk checks before execution.");
    }
}

interface ComplianceEngine {
    void generateReport();
    void logAuditTrail();

    static void compliancePolicy() {
        System.out.println("Compliance Policy: All trades must be logged and reported as per SECP regulations.");
    }
}

class AlgoTrader implements TradingEngine, ComplianceEngine {
    private String algorithmName;

    public AlgoTrader(String algorithmName) {
        this.algorithmName = algorithmName;
    }

    public void placeOrder() {
        System.out.println("[" + algorithmName + "] Executing algorithmic order...");
    }

    public void runRiskChecks() {
        System.out.println("[" + algorithmName + "] Performing automated risk checks...");
    }

    public void generateReport() {
        System.out.println("[" + algorithmName + "] Generating trade report for compliance...");
    }

    public void logAuditTrail() {
        System.out.println("[" + algorithmName + "] Logging audit trail to secure server...");
    }
}

class HumanTrader implements TradingEngine {
    private String traderName;

    public HumanTrader(String traderName) {
        this.traderName = traderName;
    }

    public void placeOrder() {
        System.out.println("[" + traderName + "] Manually placing trade order...");
    }

    public void runRiskChecks() {
        System.out.println("[" + traderName + "] Manually reviewing risk parameters...");
    }
}
