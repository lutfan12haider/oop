package lab7;

class Bank {
    final String BANK_NAME = "Secure Bank";

    void showBankDetails() {
        System.out.println("Bank Name: " + BANK_NAME);
    }
}

final class SecureTransaction {
    void processTransaction() {
        System.out.println("Transaction Processed Securely");
    }
}

class Account {
    final int accountNumber;

    Account(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    void showAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
    }

    final void calculateInterest() {
        System.out.println("Interest calculated as per bank policy.");
    }
}

class SavingsAccount extends Account {
    SavingsAccount(int accountNumber) {
        super(accountNumber);
    }

    void showSavingsMessage() {
        System.out.println("This is a savings account.");
    }
}


