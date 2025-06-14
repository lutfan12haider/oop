package lab09;

public class main1 {
    public static void main(String[] args) {
        Bank bankA = new BankA();
        Bank bankB = new BankB();
        Bank bankC = new BankC();

        System.out.println("BankA balance: $" + bankA.getBalance());
        System.out.println("BankB balance: $" + bankB.getBalance());
        System.out.println("BankC balance: $" + bankC.getBalance());
    }
}
