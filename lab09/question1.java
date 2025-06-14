package lab09;

abstract class Bank {
    public abstract double getBalance();
}

class BankA extends Bank {
    public double getBalance() {
        return 100.0;
    }
}

class BankB extends Bank {
    public double getBalance() {
        return 150.0;
    }
}

class BankC extends Bank {
    public double getBalance() {
        return 200.0;
    }
}


