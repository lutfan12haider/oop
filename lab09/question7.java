package lab09;

interface Payment {
    void pay(double amount);
    String getPaymentDetails();
    static void paymentPolicy() {
        System.out.println("General Payment Policy: All payments are processed securely and are non-refundable.");
    }
}

class CreditCardPayment implements Payment {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }

    public String getPaymentDetails() {
        return "Credit Card ending in " + cardNumber.substring(cardNumber.length() - 4);
    }
}

class PayPalPayment implements Payment {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }

    public String getPaymentDetails() {
        return "PayPal Account: " + email;
    }
}

class BitcoinPayment implements Payment {
    private String bitcoinAddress;

    public BitcoinPayment(String bitcoinAddress) {
        this.bitcoinAddress = bitcoinAddress;
    }

    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Bitcoin.");
    }

    public String getPaymentDetails() {
        return "Bitcoin Address: " + bitcoinAddress;
    }
}

