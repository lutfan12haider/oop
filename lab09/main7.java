package lab09;


public class main7 {
    public static void main(String[] args) {
        Payment[] payments = new Payment[] {
                new CreditCardPayment("1234567812345678"),
                new PayPalPayment("lutfanhaider@gmail.com"),
                new BitcoinPayment("1A567HJ8905G")
        };

        for (Payment payment : payments) {
            payment.pay(100.0);
            System.out.println(payment.getPaymentDetails());
        }

        Payment.paymentPolicy();
    }
}