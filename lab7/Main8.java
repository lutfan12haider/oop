package lab7;

public class Main8 {
    public static void main(String[] args) {
        Account acc = new Account(123456);
        acc.showAccountDetails();
        acc.calculateInterest();

        SecureTransaction transaction = new SecureTransaction();
        transaction.processTransaction();

        SavingsAccount savingsAcc = new SavingsAccount(789012);
        savingsAcc.showAccountDetails();
        savingsAcc.showSavingsMessage();
    }
}
